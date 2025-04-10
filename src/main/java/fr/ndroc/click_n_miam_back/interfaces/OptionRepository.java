package fr.ndroc.click_n_miam_back.interfaces;

import fr.ndroc.click_n_miam_back.entities.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionRepository extends JpaRepository<Option, Integer> {

//    @RestResource(path = "search-by-name" )
//    Iterable<Option> findByNameContaining(@Param("val") String name);
//
//    @RestResource(path = "search-by-name-or-age")
//    Iterable<Option> findByNameContainingOrPrice(@Param("n") String name, @Param("p") float price);
}
