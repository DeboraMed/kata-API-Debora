package com.example.kataapidebora.controlador;

import com.example.kataapidebora.config.error.BeerNotFoundException;
import com.example.kataapidebora.config.error.BreweryNotFoundException;
import com.example.kataapidebora.modelo.Beers;
import com.example.kataapidebora.modelo.Breweries;
import com.example.kataapidebora.repositorio.BeersRepositorio;
import com.example.kataapidebora.repositorio.BreweriesRepositorio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/breweries")
public class BreweriesControlador {
    private final BreweriesRepositorio breweriesRepositorio;

    public BreweriesControlador(BreweriesRepositorio breweriesRepositorio){
        this.breweriesRepositorio = breweriesRepositorio;
    }

    @GetMapping
    public ResponseEntity<List<Breweries>> getAll() {
        List<Breweries> cervecerias = breweriesRepositorio.findAll();
        return new ResponseEntity<>(cervecerias, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Breweries> getById(@PathVariable Long id) {
        Breweries breweries = breweriesRepositorio.findById(id).orElseThrow(() -> new BreweryNotFoundException(id));;
        return new ResponseEntity<>(breweries, HttpStatus.OK);
    }
}
