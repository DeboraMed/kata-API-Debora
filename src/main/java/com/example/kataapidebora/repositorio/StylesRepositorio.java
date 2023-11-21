package com.example.kataapidebora.repositorio;

import com.example.kataapidebora.modelo.Breweries;
import com.example.kataapidebora.modelo.Styles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StylesRepositorio extends JpaRepository<Styles, Long> {

}
