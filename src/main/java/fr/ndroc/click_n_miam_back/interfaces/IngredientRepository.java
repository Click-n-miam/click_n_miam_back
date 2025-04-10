package fr.ndroc.click_n_miam_back.interfaces;

import fr.ndroc.click_n_miam_back.entities.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
}
