package fr.ndroc.click_n_miam_back.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "menu_options")
public class MenuOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @EmbeddedId
    private Integer id;

    @ManyToOne
    // @MapsId("menuId")
    @JoinColumn(name = "menu_id")
    private Menu menu;

    @ManyToOne
    // @MapsId("optionId")
    @JoinColumn(name = "option_id")
    private Option option;

    @Override
    public String toString() {
        return "Option{" +
                "id=" + id +
                ", menu='" + menu +
                ", option=" + option +
                '}';
    }
}
