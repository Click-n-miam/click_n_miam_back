package fr.ndroc.click_n_miam_back.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "meal_ingredients")
public class MealIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "meal_id", nullable = false)
    private Meal meal;

    @ManyToOne
    @JoinColumn(name = "ingredient_id", nullable = false)
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
