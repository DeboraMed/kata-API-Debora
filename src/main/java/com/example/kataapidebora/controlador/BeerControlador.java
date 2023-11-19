package com.example.kataapidebora.controlador;

import com.example.kataapidebora.config.error.BeerNotFoundException;
import com.example.kataapidebora.modelo.Beer;
import com.example.kataapidebora.repositorio.BeerRepositorio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/beer")
public class BeerControlador {
    private final BeerRepositorio beerRepositorio;

    public BeerControlador(BeerRepositorio beerRepositorio){

        this.beerRepositorio = beerRepositorio;
    }

    @GetMapping("/")
    List<Beer> getBeer() { return beerRepositorio.findAll(); }

    @GetMapping("/{id}")
    Beer getBeerById(@PathVariable Long id) {
        return (Beer) beerRepositorio.findBeerById(id);
    }
}
