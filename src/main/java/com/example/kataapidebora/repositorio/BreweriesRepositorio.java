package com.example.kataapidebora.repositorio;

import com.example.kataapidebora.modelo.Beers;
import com.example.kataapidebora.modelo.Breweries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BreweriesRepositorio extends JpaRepository<Breweries, Long> {

}
