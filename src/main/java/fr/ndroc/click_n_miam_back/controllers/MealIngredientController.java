package fr.ndroc.click_n_miam_back.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MealIngredientController {

//    private final MealIngredientRepository mealIngredientRepository;
//
//    public MealIngredientController(MealIngredientRepository mealIngredientRepository) {
//        this.mealIngredientRepository = mealIngredientRepository;
//    }
//
//    @GetMapping(value={"/mealIngredient", "/mealIngredient/list"})
//    public String showMealIngredientList(Model model)
//    {
//        model.addAttribute("mealIngredients", mealIngredientRepository.findAll());
//        return "mealIngredient/list";
//    }
//
//    @GetMapping("/mealIngredient/formAdd")
//    public String formAdd(Model model)
//    {
//        return "mealIngredient/add";
//    }
//
//    @PostMapping("/mealIngredient/add")
//    public String addMealIngredient(@Valid MealIngredient mealIngredient, BindingResult bindingResult, Model model)
//    {
//        if(bindingResult.hasErrors())
//        {
//            return "mealIngredient/add";
//        }
//        mealIngredientRepository.save(mealIngredient);
//
//        return "redirect:/mealIngredient/list";
//    }
//
//    @GetMapping("/mealIngredient/edit/{id}")
//    public String showMealIngredient(@PathVariable("id") Integer id, Model model)
//    {
//        model.addAttribute("mealIngredient", mealIngredientRepository.findById(id).orElseThrow(()->new RuntimeException("MealIngredient " + id + " not found") ) );
//        return "mealIngredient/edit";
//    }
//
//    @PostMapping("/mealIngredient/update/{id}")
//    public String updateMealIngredient(@Valid MealIngredient mealIngredient, BindingResult bindingResult, Model model)
//    {
//        mealIngredientRepository.save(mealIngredient);
//        return "redirect:/mealIngredient/list";
//    }
//
//    @GetMapping("/mealIngredient/delete/{id}")
//    public String deleteMealIngredient(@PathVariable("id") Integer id, Model model)
//    {
//        MealIngredient mealIngredient = mealIngredientRepository.findById(id).orElseThrow(()->new RuntimeException("MealIngredient " + id + " not found") );
//        mealIngredientRepository.delete(mealIngredient);
//        return "redirect:/mealIngredient/list";
//    }
}
