package fr.ndroc.click_n_miam_back.controllers;

import fr.ndroc.click_n_miam_back.entities.Ingredient;
import fr.ndroc.click_n_miam_back.interfaces.IngredientRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IngredientController {

    private final IngredientRepository ingredientRepository;

    public IngredientController(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @GetMapping(value={"/ingredient", "/ingredient/list"})
    public String showIngredientList(Model model)
    {
        model.addAttribute("ingredients", ingredientRepository.findAll());
        return "ingredient/list";
    }

    @GetMapping("/ingredient/formAdd")
    public String formAdd(Model model)
    {
        return "ingredient/add";
    }

    @PostMapping("/ingredient/add")
    public String addIngredient(@Valid Ingredient ingredient, BindingResult bindingResult, Model model)
    {
        if(bindingResult.hasErrors())
        {
            return "ingredient/add";
        }
        ingredientRepository.save(ingredient);

        return "redirect:/ingredient/list";
    }

    @GetMapping("/ingredient/edit/{id}")
    public String showIngredient(@PathVariable("id") Integer id, Model model)
    {
        model.addAttribute("ingredient", ingredientRepository.findById(id).orElseThrow(()->new RuntimeException("Ingredient " + id + " not found") ) );
        return "ingredient/edit";
    }

    @PostMapping("/ingredient/update/{id}")
    public String updateIngredient(@Valid Ingredient ingredient, BindingResult bindingResult, Model model)
    {
        ingredientRepository.save(ingredient);
        return "redirect:/ingredient/list";
    }

    @GetMapping("/ingredient/delete/{id}")
    public String deleteIngredient(@PathVariable("id") Integer id, Model model)
    {
        Ingredient ingredient = ingredientRepository.findById(id).orElseThrow(()->new RuntimeException("Ingredient " + id + " not found") );
        ingredientRepository.delete(ingredient);
        return "redirect:/ingredient/list";
    }
}
