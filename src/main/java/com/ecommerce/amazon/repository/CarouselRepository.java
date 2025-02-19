package com.ecommerce.amazon.repository;

import com.ecommerce.amazon.model.Carousel;

import java.util.List;

public interface CarouselRepository {
    public List<Carousel> getAllCarousel();
    public void creatCarousel(Carousel carousel);
    public void updateCarousel(int carouselId,Carousel carousel);
    public void deletCarousel(int carousel);


}
