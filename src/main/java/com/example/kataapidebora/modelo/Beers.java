package com.example.kataapidebora.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "beers")
public class Beers {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "brewery_id")
    private Long breweryId;

    private String name;

    @Column(name = "cat_id")
    private Long catId;

    @Column(name = "style_id")
    private Long styleId;

    private Double abv;

    private float ibu;

    private float srm;

    private Long upc;

    private String filepath;

    @Column(columnDefinition = "TEXT")
    private String descript;

    @Column(name = "add_user")
    private Long addUser;

    @Column(name = "last_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastMod;

    // Constructor, getters y setters

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getAbv() {
        return abv;
    }
    public void setAbv(Double abv) {
        this.abv = abv;
    }


}
