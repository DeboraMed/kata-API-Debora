package com.example.kataapidebora.repositorio;

import com.example.kataapidebora.modelo.Breweries;
import com.example.kataapidebora.modelo.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepositorio extends JpaRepository<Categories, Long> {

}
