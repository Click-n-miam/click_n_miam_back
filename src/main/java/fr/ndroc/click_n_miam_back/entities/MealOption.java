package fr.ndroc.click_n_miam_back.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "meal_options")
public class MealOption {

    @EmbeddedId
    private MealOptionId id;

    @ManyToOne
    @MapsId("mealId") // Associe mealId à Meal
    @JoinColumn(name = "meal_id")
    private Meal meal;

    @ManyToOne
    @MapsId("optionId") // Associe optionId à Option
    @JoinColumn(name = "option_id")
    private Option option;

    @Override
    public String toString() {
        return "Option{" +
                "id=" + id +
                ", meal='" + meal +
                ", option=" + option +
                '}';
    }
}
