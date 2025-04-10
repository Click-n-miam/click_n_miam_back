package fr.ndroc.click_n_miam_back.interfaces;

import fr.ndroc.click_n_miam_back.entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> {

    @Query("SELECT m FROM Menu m WHERE m.eat_date BETWEEN :startDate AND :endDate")
    List<Menu> findMenusForWeek(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);
}
