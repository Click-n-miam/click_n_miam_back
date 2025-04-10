package fr.ndroc.click_n_miam_back.interfaces;

import fr.ndroc.click_n_miam_back.entities.Meal;
import fr.ndroc.click_n_miam_back.enums.MealType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MealRepository extends JpaRepository<Meal, Integer> {
    List<Meal> findByType(MealType type);

}
