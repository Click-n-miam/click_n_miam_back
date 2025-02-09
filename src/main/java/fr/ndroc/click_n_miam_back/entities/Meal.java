package fr.ndroc.click_n_miam_back.entities;

import fr.ndroc.click_n_miam_back.enums.MealType;
import jakarta.persistence.*;
import java.awt.*;

@Entity
@Table(name = "meals")
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String description;
    private String image;

    @Enumerated(EnumType.STRING)
    private MealType type;

    public Meal() {
    }

    public Meal(Integer id, String title, String description, String image) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }

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
