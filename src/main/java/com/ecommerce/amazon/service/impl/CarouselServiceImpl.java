package com.ecommerce.amazon.service.impl;

import com.ecommerce.amazon.model.Carousel;
import com.ecommerce.amazon.repository.CarouselRepository;
import com.ecommerce.amazon.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarouselServiceImpl implements CarouselService {
   @Autowired
    CarouselRepository carouselRepository;


    @Override
    public List<Carousel> getAllCarousel() {
        return carouselRepository.getAllCarousel();
    }

    @Override
    public void creatCarousel(Carousel carousel) {
         carouselRepository.creatCarousel(carousel);
    }

    @Override
    public void updateCarousel(int carouselId, Carousel carousel) {
           carouselRepository.updateCarousel(carouselId,carousel);
    }

    @Override
    public void deletCarousel(int carousel) {
        carouselRepository.deletCarousel(carousel);
    }
}
