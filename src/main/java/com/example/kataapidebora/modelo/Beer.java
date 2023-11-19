package com.example.kataapidebora.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Beer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private int brewery_id;

    private String name;

    private int cat_id;

    private int style_id;

    private float abv;

    private float ibu;

    private float srm;

    private int upc;

    private String filepath;

    private String descript;

    private int add_user;

    private String last_mod;


}
