package fr.ndroc.click_n_miam_back.controllers;

//import fr.ndroc.click_n_miam_back.entities.MenuOption;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MenuOptionController {

//    @Autowired
//    private MenuOptionRepository menuOptionRepository;
//
//    @GetMapping(value={"/menuOption", "/menuOption/list"})
//    public String showMenuOptionList(Model model)
//    {
//        model.addAttribute("menuOptions", menuOptionRepository.findAll());
//        return "menuOption/list";
//    }
//
//    @GetMapping("/menuOption/formAdd")
//    public String formAdd(Model model)
//    {
//        return "menuOption/add";
//    }
//
//    @PostMapping("/menuOption/add")
//    public String addMenuOption(@Valid MenuOption menuOption, BindingResult bindingResult, Model model)
//    {
//        if(bindingResult.hasErrors())
//        {
//            return "menuOption/add";
//        }
//        menuOptionRepository.save(menuOption);
//
//        return "redirect:/menuOption/list";
//    }
//
//    @GetMapping("/menuOption/edit/{id}")
//    public String showMenuOption(@PathVariable("id") Integer id, Model model)
//    {
//        model.addAttribute("menuOption", menuOptionRepository.findById(id).orElseThrow(()->new RuntimeException("MenuOption " + id + " not found") ) );
//        return "menuOption/edit";
//    }
//
//    @PostMapping("/menuOption/update/{id}")
//    public String updateMenuOption(@Valid MenuOption menuOption, BindingResult bindingResult, Model model)
//    {
//        menuOptionRepository.save(menuOption);
//        return "redirect:/menuOption/list";
//    }
//
//    @GetMapping("/menuOption/delete/{id}")
//    public String deleteMenuOption(@PathVariable("id") Integer id, Model model)
//    {
//        MenuOption menuOption = menuOptionRepository.findById(id).orElseThrow(()->new RuntimeException("MenuOption " + id + " not found") );
//        menuOptionRepository.delete(menuOption);
//        return "redirect:/mealOption/list";
//    }
}
