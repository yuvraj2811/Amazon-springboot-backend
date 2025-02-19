package com.ecommerce.amazon.model;

public class Carousel {
    private int carouselId;
    private String carouselName;
    private int carouselSlides;

    public Carousel() {
    }

    public Carousel(int carouselId, String carouselName, int carouselSlides) {
        this.carouselId = carouselId;
        this.carouselName = carouselName;
        this.carouselSlides = carouselSlides;
    }

    public int getCarouselId() {
        return carouselId;
    }

    public void setCarouselId(int carouselId) {
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
