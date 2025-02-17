package fr.ndroc.click_n_miam_back.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "meal_options")
public class MealOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "meal_id", nullable = false)
    private Meal meal;

    @ManyToOne
    @JoinColumn(name = "option_id", nullable = false)
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
