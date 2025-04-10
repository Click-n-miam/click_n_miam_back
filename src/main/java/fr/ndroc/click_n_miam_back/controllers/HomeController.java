package fr.ndroc.click_n_miam_back.controllers;

import fr.ndroc.click_n_miam_back.interfaces.IngredientRepository;
import fr.ndroc.click_n_miam_back.interfaces.MenuRepository;
import fr.ndroc.click_n_miam_back.interfaces.OptionRepository;
import fr.ndroc.click_n_miam_back.interfaces.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


@Controller
public class HomeController {

    @Autowired
    private OptionRepository optionRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private IngredientRepository ingredientRepository;

    @Autowired
    private MenuRepository menuRepository;

    @RequestMapping(value={"", "/", "home"})
    public String displayHomePage(Model model) {

        LocalDate today = LocalDate.now();

        model.addAttribute("options_count", optionRepository.count());
        model.addAttribute("orders_count", orderRepository.count());
        model.addAttribute("ingredients_count", ingredientRepository.count());

        model.addAttribute("week_menus", menuRepository.findMenusForWeek(today.with(DayOfWeek.MONDAY), today.with(DayOfWeek.SUNDAY)));

        return "index";
    }

    @RequestMapping("demo/meal")
    public String displayMealPage(Model model) {

        return "demo/meal";
    }

    @RequestMapping("demo/cmd")
    public String displayCmdPage(Model model) {

        return "demo/cmd";
    }
  
}
