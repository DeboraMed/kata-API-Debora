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
@Table(name = "breweries")
public class Breweries {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private String address1;

    private String address2;

    private String city;

    private String state;

    private String code;

    private String country;

    private String phone;

    private String website;

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


}
