package com.example.kataapidebora.repositorio;

import com.example.kataapidebora.modelo.Beers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeersRepositorio extends JpaRepository<Beers, Long> {

    //List<Beer>findBeerById(Long beerId);
    //Beers findById(Long beerId);
}
