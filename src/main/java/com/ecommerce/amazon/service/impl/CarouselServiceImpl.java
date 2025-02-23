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
        return carouselRepository.findAll();
    }

    @Override
    public void creatCarousel(Carousel carousel) {
         carouselRepository.save(carousel);
    }

    @Override
    public void updateCarousel(String carouselId, Carousel carousel) {
           Carousel updateToCarousel = getCarouselById(carouselId);
           if (updateToCarousel.getCarouselId()!=null){
               carouselRepository.save(carousel);
           }
    }

    @Override
    public void deletCarousel(String carouselId) {
        carouselRepository.deleteById(carouselId);
    }

    @Override
    public Carousel getCarouselById(String carouselId) {
        return  carouselRepository.findById(carouselId).orElse(new Carousel());
    }
}
