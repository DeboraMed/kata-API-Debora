package com.example.kataapidebora.controlador;

import com.example.kataapidebora.config.error.BeerNotFoundException;
import com.example.kataapidebora.config.error.StyleNotFoundException;
import com.example.kataapidebora.modelo.Beers;
import com.example.kataapidebora.modelo.Styles;
import com.example.kataapidebora.repositorio.BeersRepositorio;
import com.example.kataapidebora.repositorio.StylesRepositorio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/styles")
public class StylesControlador {
    private final StylesRepositorio stylesRepositorio;

    public StylesControlador(StylesRepositorio stylesRepositorio){
        this.stylesRepositorio = stylesRepositorio;
    }

    @GetMapping
    public ResponseEntity<List<Styles>> getAll() {
        List<Styles> estilos = stylesRepositorio.findAll();
        return new ResponseEntity<>(estilos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Styles> getById(@PathVariable Long id) {
        Styles styles = stylesRepositorio.findById(id).orElseThrow(() -> new StyleNotFoundException(id));;
        return new ResponseEntity<>(styles, HttpStatus.OK);
    }
}
