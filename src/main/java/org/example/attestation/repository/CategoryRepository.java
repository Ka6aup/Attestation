package org.example.attestation.repository;

import org.example.attestation.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // Методы для поиска категорий, например, по имени
    Category findByName(String name);

    List<Category> findAllByDeletedFalse();

}
