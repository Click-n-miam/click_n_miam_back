package fr.ndroc.click_n_miam_back.controllers;

import fr.ndroc.click_n_miam_back.interfaces.OptionRepository;
import fr.ndroc.click_n_miam_back.interfaces.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;


@Controller
public class HomeController {

    private final OptionRepository optionRepository;
    private final OrderRepository orderRepository;

    public HomeController(OptionRepository optionRepository, OrderRepository orderRepository) {
        this.optionRepository = optionRepository;
        this.orderRepository = orderRepository;
    }

    @RequestMapping(value={"", "/", "home"})
    public String displayHomePage(Model model) {

        model.addAttribute("options_count", optionRepository.count());
        model.addAttribute("orders_count", orderRepository.count());
        return "index.html";
    }
  
}
