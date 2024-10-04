package com.example.movieapi.Repositary;

import com.example.movieapi.Entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepositary extends JpaRepository<Movie, Long> {
}