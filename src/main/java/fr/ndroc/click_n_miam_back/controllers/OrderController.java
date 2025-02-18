package fr.ndroc.click_n_miam_back.controllers;

import fr.ndroc.click_n_miam_back.entities.Order;
import fr.ndroc.click_n_miam_back.interfaces.OrderRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping(value={"/order", "/order/list"})
    public String showOrderList(Model model)
    {
        model.addAttribute("orders", orderRepository.findAllWithMeals());
        model.addAttribute("orders_count", orderRepository.count());

        return "order/list";
    }

    @GetMapping("/order/formAdd")
    public String formAdd(Model model)
    {
        return "order/add";
    }

    @PostMapping("/order/add")
    public String addOrder(@Valid Order order, BindingResult bindingResult, Model model)
    {
        if(bindingResult.hasErrors())
        {
            return "order/add";
        }
        orderRepository.save(order);

        return "redirect:/order/list";
    }

    @GetMapping("/order/edit/{id}")
    public String showOrder(@PathVariable("id") Integer id, Model model)
    {
        model.addAttribute("order", orderRepository.findById(id).orElseThrow(()->new RuntimeException("Order " + id + " not found") ) );
        return "order/edit";
    }

    @PostMapping("/order/update/{id}")
    public String updateOrder(@Valid Order order, BindingResult bindingResult, Model model)
    {
        orderRepository.save(order);
        return "redirect:/order/list";
    }

    @GetMapping("/order/delete/{id}")
    public String deleteOrder(@PathVariable("id") Integer id, Model model)
    {
        Order order = orderRepository.findById(id).orElseThrow(()->new RuntimeException("Order " + id + " not found") );
        orderRepository.delete(order);
        return "redirect:/order/list";
    }
}
