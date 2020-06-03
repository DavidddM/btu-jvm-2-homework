package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String country;
}
