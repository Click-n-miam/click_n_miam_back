package fr.ndroc.click_n_miam_back.controllers;

import fr.ndroc.click_n_miam_back.entities.Option;
import fr.ndroc.click_n_miam_back.interfaces.OptionRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class OptionController {

    private final OptionRepository optionRepository;

    public OptionController(OptionRepository optionRepository) {
        this.optionRepository = optionRepository;
    }

    @GetMapping("/option/list")
    public String showOptionList(Model model)
    {
        model.addAttribute("options", optionRepository.findAll());
        return "option/list";
    }

    @GetMapping("/option/formAdd")
    public String formAdd(Model model)
    {
        return "option/add";
    }

    @PostMapping("/option/addOption")
    public String addOption(@Valid Option option, BindingResult bindingResult, Model model)
    {
        if(bindingResult.hasErrors())
        {
            return "option/add";
        }
        optionRepository.save(option);

        return "redirect:/option/index";
    }

    @GetMapping("/option/edit/{id}")
    public String showOption(@PathVariable("id") Integer id, Model model)
    {
        model.addAttribute("option", optionRepository.findById(id).orElseThrow(()->new RuntimeException("Option " + id + " not found") ) );
        return "option/edit";
    }

    @GetMapping("/option/delete/{id}")
    public String deleteOption(@PathVariable("id") Integer id, Model model)
    {
        Option option = optionRepository.findById(id).orElseThrow(()->new RuntimeException("Option " + id + " not found") );
        optionRepository.delete(option);
        return "redirect:/option/index";
    }
}
