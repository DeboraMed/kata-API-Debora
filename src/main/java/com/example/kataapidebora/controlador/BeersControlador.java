package com.example.kataapidebora.controlador;

import com.example.kataapidebora.config.error.BeerNotFoundException;
import com.example.kataapidebora.modelo.Beers;
import com.example.kataapidebora.repositorio.BeersRepositorio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/beers")
public class BeersControlador {
    private final BeersRepositorio beerRepositorio;

    public BeersControlador(BeersRepositorio beerRepositorio){
        this.beerRepositorio = beerRepositorio;
    }

    @GetMapping
    public ResponseEntity<List<Beers>> getAll() {
        List<Beers> cervezas = beerRepositorio.findAll();
        return new ResponseEntity<>(cervezas, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Beers> getById(@PathVariable Long id) {
        Beers beer = beerRepositorio.findById(id).orElseThrow(() -> new BeerNotFoundException(id));;
        return new ResponseEntity<>(beer, HttpStatus.OK);
    }
}
