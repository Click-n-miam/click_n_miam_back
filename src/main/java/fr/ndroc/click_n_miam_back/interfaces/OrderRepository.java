package fr.ndroc.click_n_miam_back.interfaces;

import fr.ndroc.click_n_miam_back.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    @Query("SELECT DISTINCT o FROM Order o " +
            "LEFT JOIN o.menus m " +
            "LEFT JOIN m.mainMeal mm " +
            "LEFT JOIN m.dessertMeal dm " +
            "LEFT JOIN m.options mo"
    )
    Iterable<Order> findAllWithMeals();
}
