package fr.ndroc.click_n_miam_back.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Embeddable
public class MenuOptionId implements Serializable {

    private Integer menuId;
    private Integer optionId;

    public MenuOptionId(Integer menuId, Integer optionId) {
        this.menuId = menuId;
        this.optionId = optionId;
    }

    public MenuOptionId() {

    }
}
