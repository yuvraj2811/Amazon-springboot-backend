package com.ecommerce.amazon.controller;


import com.ecommerce.amazon.model.Carousel;
import com.ecommerce.amazon.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/carousel")

public class CarouselCantroller {

    @Autowired
    CarouselService carouselService;

    @GetMapping
    public List<Carousel>getAllCarousel(){

        return carouselService.getAllCarousel();
    }

    @PostMapping
    public String creatCarousel(Carousel carousel){
       carouselService.creatCarousel(carousel);
        return "Creat Successfully";
    }

    @PutMapping("/{carousalId}")
    public String updateCarousel(@PathVariable int carouselId,@RequestBody Carousel carousel){
       carouselService.updateCarousel(carouselId,carousel);
        return "Update successfully";
    }

    @DeleteMapping("/{carouselId}")
    public String deletCarousel(int carouselId){
       carouselService.deletCarousel(carouselId);
        return "Delet Successfully";
    }

}
