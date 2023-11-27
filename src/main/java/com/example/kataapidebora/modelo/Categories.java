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
@Table(name = "categories")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String cat_name;

    private Date last_mod;

    // Constructor, getters y setters

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCatName() {
        return cat_name;
    }
    public void setCatName(String cat_name) {
        this.cat_name = cat_name;
    }
    public Date getLastMod() {
        return last_mod;
    }
    public void setLastMod(Date last_mod) {
        this.last_mod = last_mod;
    }


}
