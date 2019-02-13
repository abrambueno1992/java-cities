package com.abrahambueno.javacities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Cities {
    private @Id @GeneratedValue Long id;
    private String name;
    private double homePrice;
    private int affordableIndex;

    public Cities() {
        // default constructor
    }

    public Cities(String name, double homePrice, int affordableIndex) {
        this.name = name;
        this.homePrice = homePrice;
        this.affordableIndex = affordableIndex;
    }
}
