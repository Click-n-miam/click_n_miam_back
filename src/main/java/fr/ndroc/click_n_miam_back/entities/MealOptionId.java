package fr.ndroc.click_n_miam_back.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Embeddable
public class MealOptionId implements Serializable {

    private Integer mealId;
    private Integer optionId;

    public MealOptionId(Integer mealId, Integer optionId) {
        this.mealId = mealId;
        this.optionId = optionId;
    }

    public MealOptionId() {

    }
}
