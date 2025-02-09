package fr.ndroc.click_n_miam_back.controllers;

import fr.ndroc.click_n_miam_back.entities.MealOption;
import fr.ndroc.click_n_miam_back.interfaces.MealOptionRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MealOptionController {

    private final MealOptionRepository mealOptionRepository;

    public MealOptionController(MealOptionRepository mealOptionRepository) {
        this.mealOptionRepository = mealOptionRepository;
    }

    @GetMapping(value={"/mealOption", "/mealOption/list"})
    public String showMealOptionList(Model model)
    {
        model.addAttribute("mealOptions", mealOptionRepository.findAll());
        return "mealOption/list";
    }

    @GetMapping("/mealOption/formAdd")
    public String formAdd(Model model)
    {
        return "mealOption/add";
    }

    @PostMapping("/mealOption/add")
    public String addMealOption(@Valid MealOption mealOption, BindingResult bindingResult, Model model)
    {
        if(bindingResult.hasErrors())
        {
            return "mealOption/add";
        }
        mealOptionRepository.save(mealOption);

        return "redirect:/mealOption/list";
    }

    @GetMapping("/mealOption/edit/{id}")
    public String showMealOption(@PathVariable("id") Integer id, Model model)
    {
        model.addAttribute("mealOption", mealOptionRepository.findById(id).orElseThrow(()->new RuntimeException("MealOption " + id + " not found") ) );
        return "mealOption/edit";
    }

    @PostMapping("/mealOption/update/{id}")
    public String updateMealOption(@Valid MealOption mealOption, BindingResult bindingResult, Model model)
    {
        mealOptionRepository.save(mealOption);
        return "redirect:/mealOption/list";
    }

    @GetMapping("/mealOption/delete/{id}")
    public String deleteMealOption(@PathVariable("id") Integer id, Model model)
    {
        MealOption mealOption = mealOptionRepository.findById(id).orElseThrow(()->new RuntimeException("MealOption " + id + " not found") );
        mealOptionRepository.delete(mealOption);
        return "redirect:/mealOption/list";
    }
}
