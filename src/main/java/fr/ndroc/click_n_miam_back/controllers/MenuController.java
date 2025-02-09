package fr.ndroc.click_n_miam_back.controllers;

import fr.ndroc.click_n_miam_back.entities.Menu;
import fr.ndroc.click_n_miam_back.interfaces.MenuRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MenuController {

    private final MenuRepository menuRepository;

    public MenuController(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @GetMapping(value={"/menu", "/menu/list"})
    public String showMenuList(Model model)
    {
        model.addAttribute("menus", menuRepository.findAll());
        return "menu/list";
    }

    @GetMapping("/menu/formAdd")
    public String formAdd(Model model)
    {
        return "menu/add";
    }

    @PostMapping("/menu/add")
    public String addMenu(@Valid Menu menu, BindingResult bindingResult, Model model)
    {
        if(bindingResult.hasErrors())
        {
            return "menu/add";
        }
        menuRepository.save(menu);

        return "redirect:/menu/list";
    }

    @GetMapping("/menu/edit/{id}")
    public String showMenu(@PathVariable("id") Integer id, Model model)
    {
        model.addAttribute("menu", menuRepository.findById(id).orElseThrow(()->new RuntimeException("Menu " + id + " not found") ) );
        return "menu/edit";
    }

    @PostMapping("/menu/update/{id}")
    public String updateMenu(@Valid Menu menu, BindingResult bindingResult, Model model)
    {
        menuRepository.save(menu);
        return "redirect:/menu/list";
    }

    @GetMapping("/menu/delete/{id}")
    public String deleteMenu(@PathVariable("id") Integer id, Model model)
    {
        Menu menu = menuRepository.findById(id).orElseThrow(()->new RuntimeException("Menu " + id + " not found") );
        menuRepository.delete(menu);
        return "redirect:/menu/list";
    }
}
