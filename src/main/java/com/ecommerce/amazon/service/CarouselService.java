package com.ecommerce.amazon.service;

import com.ecommerce.amazon.model.Carousel;

import java.util.List;

public interface CarouselService {
    public List<Carousel>getAllCarousel();
    public void creatCarousel(Carousel carousel);
    public void updateCarousel(String carouselId,Carousel carousel);
    public void deletCarousel(String carouselId);

    public Carousel getCarouselById(String carouselId);


}
