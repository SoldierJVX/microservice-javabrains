package com.study.moviecatalogservice.models;

import lombok.Data;

@Data
public class CatalogItem {

    private String name;

    private String description;

    private int rating;

    public CatalogItem(String name, String description, int rating) {
        this.name = name;
        this.description = description;
        this.rating = rating;
    }
}
