package com.example.kataapidebora.controlador;

import com.example.kataapidebora.config.error.BeerNotFoundException;
import com.example.kataapidebora.modelo.Beers;
import com.example.kataapidebora.repositorio.BeersRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/beers")
public class BeersControlador {
    private final BeersRepositorio beerRepositorio;

    @Autowired
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

    // nuevo
    @PostMapping
    public ResponseEntity<Beers> createBeer(@RequestBody Beers beers) {
        Beers nuevaBeer = beerRepositorio.save(beers);
        return new ResponseEntity<>(nuevaBeer, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public Beers updateBeer(@PathVariable Long id, @RequestBody Beers updatedBeer) {
        Beers existingBeer = beerRepositorio.findById(id).orElse(null);
        if (existingBeer != null) {
            existingBeer.setName(updatedBeer.getName());
            existingBeer.setAbv(updatedBeer.getAbv());
            // Actualiza otros campos si es necesario
            return beerRepositorio.save(existingBeer);
        }
        return null; // Devuelve null si no se encuentra la cerveza.
    }
    @DeleteMapping("/{id}")
    public void deleteBeer(@PathVariable Long id) {
        beerRepositorio.deleteById(id);
    }


}
