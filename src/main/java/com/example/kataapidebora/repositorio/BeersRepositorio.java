package com.example.kataapidebora.repositorio;

import com.example.kataapidebora.modelo.Beers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BeersRepositorio extends JpaRepository<Beers, Long> {
    List<Beers> findByName(String name);
    List<Beers> findByAbvBetween(Double minAbv, Double maxAbv);
}
