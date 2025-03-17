package fr.ndroc.click_n_miam_back.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "menus")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate eat_date;

    @ManyToOne
    @JoinColumn(name = "order_id")
    @JsonIgnore
    private Order order;

    @ManyToOne
    @JoinColumn(name = "main_meal_id")
    private Meal mainMeal;

    @ManyToOne
    @JoinColumn(name = "dessert_meal_id")
    private Meal dessertMeal;

    @ManyToMany
    @JoinTable(
            name = "menu_options",
            joinColumns = @JoinColumn(name = "menu_id"),
            inverseJoinColumns = @JoinColumn(name = "option_id")
    )
    private Set<Option> options;

    public Menu() {
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public LocalDate getEat_date() { return eat_date; }
    public void setEat_date(LocalDate eat_date) { this.eat_date = eat_date; }

    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }

    public Meal getMainMeal() { return mainMeal; }
    public void setMainMeal(Meal mainMeal) { this.mainMeal = mainMeal; }

    public Meal getDessertMeal() { return dessertMeal; }
    public void setDessertMeal(Meal dessertMeal) { this.dessertMeal = dessertMeal; }

    public Set<Option> getOptions() {
        return options;
    }
    public void setOptions(Set<Option> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", eat_date='" + eat_date +
                ", order=" + order +
                ", mainMeal=" + mainMeal +
                ", dessertMeal=" + dessertMeal +
                '}';
    }
}
