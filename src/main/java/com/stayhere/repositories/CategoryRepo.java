package com.stayhere.repositories;

import com.stayhere.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {
    // Query method
    Optional<Category> findById(Long id);

}
