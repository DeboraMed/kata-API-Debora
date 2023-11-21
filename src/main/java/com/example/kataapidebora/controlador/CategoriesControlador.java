package com.example.kataapidebora.controlador;

import com.example.kataapidebora.config.error.BreweryNotFoundException;
import com.example.kataapidebora.config.error.CategoryNotFoundException;
import com.example.kataapidebora.modelo.Breweries;
import com.example.kataapidebora.modelo.Categories;
import com.example.kataapidebora.repositorio.BreweriesRepositorio;
import com.example.kataapidebora.repositorio.CategoriesRepositorio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoriesControlador {
    private final CategoriesRepositorio categoriesRepositorio;

    public CategoriesControlador(CategoriesRepositorio categoriesRepositorio){
        this.categoriesRepositorio = categoriesRepositorio;
    }

    @GetMapping
    public ResponseEntity<List<Categories>> getAll() {
        List<Categories> categorias = categoriesRepositorio.findAll();
        return new ResponseEntity<>(categorias, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categories> getById(@PathVariable Long id) {
        Categories categories = categoriesRepositorio.findById(id).orElseThrow(() -> new CategoryNotFoundException(id));;
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
}
