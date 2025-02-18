package fr.ndroc.click_n_miam_back.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "meal_ingredients")
public class MealIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @EmbeddedId
    private Integer id;

    @ManyToOne
    // @MapsId("mealId")
    @JoinColumn(name = "meal_id")
    private Meal meal;

    @ManyToOne
    // @MapsId("ingredientId")
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
