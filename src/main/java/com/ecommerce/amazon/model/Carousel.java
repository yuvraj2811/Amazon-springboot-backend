package com.ecommerce.amazon.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Carousel {
    @Id
    private String carouselId;
    private String carouselName;
    private int carouselSlides;

    public Carousel() {
    }

    public Carousel(String carouselId, String carouselName, int carouselSlides) {
        this.carouselId = carouselId;
        this.carouselName = carouselName;
        this.carouselSlides = carouselSlides;
    }

    public String getCarouselId() {
        return carouselId;
    }

    public void setCarouselId(String carouselId) {
        this.carouselId = carouselId;
    }

    public String getCarouselName() {
        return carouselName;
    }

    public void setCarouselName(String carouselName) {
        this.carouselName = carouselName;
    }

    public int getCarouselSlides() {
        return carouselSlides;
    }

    public void setCarouselSlides(int carouselSlides) {
        this.carouselSlides = carouselSlides;
    }
}
