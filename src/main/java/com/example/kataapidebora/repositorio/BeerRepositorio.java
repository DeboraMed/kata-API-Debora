package com.example.kataapidebora.repositorio;

import com.example.kataapidebora.modelo.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BeerRepositorio extends JpaRepository<Beer, Long> {

    List<Beer>findBeerById(Long beerId);
}
