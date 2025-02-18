package fr.ndroc.click_n_miam_back.interfaces;

import fr.ndroc.click_n_miam_back.entities.MenuOption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuOptionRepository extends JpaRepository<MenuOption, Integer> {
}
