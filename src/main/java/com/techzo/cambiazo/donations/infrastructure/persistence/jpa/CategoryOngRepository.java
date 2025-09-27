package com.techzo.cambiazo.donations.infrastructure.persistence.jpa;

import com.techzo.cambiazo.donations.domain.model.entities.CategoryOng;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryOngRepository extends JpaRepository<CategoryOng, Long>{
    boolean existsByName(String name);
    boolean existsById(Long Id);

    boolean existsByNameAndIdIsNot(String name, Long id);
}
