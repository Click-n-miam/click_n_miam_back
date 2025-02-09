package fr.ndroc.click_n_miam_back.controllers;

import fr.ndroc.click_n_miam_back.entities.Meal;
import fr.ndroc.click_n_miam_back.entities.Meal;
import fr.ndroc.click_n_miam_back.interfaces.MealRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class MealController {

    private final MealRepository mealRepository;

    public MealController(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    @GetMapping(value={"/meal", "/meal/list"})
    public String showMealList(Model model)
    {
        model.addAttribute("meals", mealRepository.findAll());
        return "meal/list";
    }

    @GetMapping("/meal/formAdd")
    public String formAdd(Model model)
    {
        return "meal/add";
    }

    @PostMapping("/meal/add")
    public String addMeal(@Valid Meal meal, BindingResult bindingResult, Model model)
    {
        if(bindingResult.hasErrors())
        {
            return "meal/add";
        }
        mealRepository.save(meal);

        return "redirect:/meal/list";
    }

    @GetMapping("/meal/edit/{id}")
    public String showMeal(@PathVariable("id") Integer id, Model model)
    {
        model.addAttribute("meal", mealRepository.findById(id).orElseThrow(()->new RuntimeException("Meal " + id + " not found") ) );
        return "meal/edit";
    }

    @PostMapping("/meal/update/{id}")
    public String updateMeal(@Valid Meal meal, BindingResult bindingResult, Model model)
    {
        mealRepository.save(meal);
        return "redirect:/meal/list";
    }

    @GetMapping("/meal/delete/{id}")
    public String deleteMeal(@PathVariable("id") Integer id, Model model)
    {
        Meal meal = mealRepository.findById(id).orElseThrow(()->new RuntimeException("Meal " + id + " not found") );
        mealRepository.delete(meal);
        return "redirect:/meal/list";
    }
}
