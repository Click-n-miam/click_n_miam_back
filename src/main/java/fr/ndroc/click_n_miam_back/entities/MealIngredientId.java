package fr.ndroc.click_n_miam_back.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Embeddable
public class MealIngredientId implements Serializable {

    private Integer mealId;
    private Integer ingredientId;

    public MealIngredientId(Integer mealId, Integer ingredientId) {
        this.mealId = mealId;
        this.ingredientId = ingredientId;
    }

    public MealIngredientId() {

    }
}
