package com.self.graphqlexample.repository;

import com.self.graphqlexample.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Integer> {
}
