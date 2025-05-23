package fr.ndroc.click_n_miam_back.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="ingredients")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Boolean allergen;

    @ManyToMany(mappedBy = "ingredients")
    private Set<Meal> meals;

    public Ingredient() {
    }

    public Ingredient(Integer id, String name, Boolean allergen) {
        this.id = id;
        this.name = name;
        this.allergen = allergen;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAllergen() {
        return allergen;
    }
    public void setAllergen(Boolean allergen) {
        this.allergen = allergen;
    }

    public Set<Meal> getMeals() {
        return meals;
    }
    public void setMeals(Set<Meal> meals) {
        this.meals = meals;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", allergen=" + allergen +
                '}';
    }
}
