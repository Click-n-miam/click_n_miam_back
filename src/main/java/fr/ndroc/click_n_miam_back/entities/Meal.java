package fr.ndroc.click_n_miam_back.entities;

import fr.ndroc.click_n_miam_back.enums.MealType;
import jakarta.persistence.*;
import java.awt.*;
import java.util.List;

@Entity
@Table(name = "meals")
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String description;
    private String image;

    @ManyToMany
    @JoinTable(
            name = "meal_ingredients",
            joinColumns = @JoinColumn(name = "meal_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id")
    )
    private List<MealIngredient> ingredients;

    @Enumerated(EnumType.STRING)
    private MealType type;

    public Meal() {
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }

    public MealType getType() {
        return type;
    }
    public void setType(MealType type) {
        this.type = type;
    }

    public List<MealIngredient> getIngredients() {
        return ingredients;
    }
    public void setIngredients(List<MealIngredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", name='" + title + '\'' +
                ", description=" + description +
                "image=" + image +
                '}';
    }
}
