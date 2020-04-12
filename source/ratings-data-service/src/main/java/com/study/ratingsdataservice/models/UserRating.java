package com.study.ratingsdataservice.models;

import lombok.Data;

import java.util.List;

@Data
public class UserRating {
    private List<Rating> userRating;

    public UserRating() {
    }

    public UserRating(List<Rating> userRating) {
        this.userRating = userRating;
    }
}
