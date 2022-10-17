package com.estera.webform.repositories;

import com.estera.webform.models.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BlogRepository extends JpaRepository<Blog, Long> {
    List<Blog> findAll();
    List<Blog> findByTitle(String title);
    Optional<Blog> findById(Long id);
}

