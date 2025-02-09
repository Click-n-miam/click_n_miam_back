package fr.ndroc.click_n_miam_back.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "meal_ingredients")
public class MealIngredient {

    @EmbeddedId
    private MealIngredientId id;

    @ManyToOne
    @MapsId("mealId") // Associe mealId à Meal
    @JoinColumn(name = "meal_id")
    private Meal meal;

    @ManyToOne
    @MapsId("ingredientId") // Associe ingredientId à Ingredient
    @JoinColumn(name = "ingredient_id")
    private Ingredient ingredient;

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", meal='" + meal +
                ", ingredient=" + ingredient +
                '}';
    }
}
