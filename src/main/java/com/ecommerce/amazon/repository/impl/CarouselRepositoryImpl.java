//package com.ecommerce.amazon.repository.impl;
//
//import com.ecommerce.amazon.model.Carousel;
//import com.ecommerce.amazon.repository.CarouselRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Repository
//public class CarouselRepositoryImpl implements CarouselRepository {
//    List<Carousel>carousels=new ArrayList<>();
//
//   public CarouselRepositoryImpl(){
//        carousels.add(new Carousel(1,"medicine",3));
//        carousels.add(new Carousel(2,"groceries",3));
//    }
//
//
//
//    @Override
//    public List<Carousel> getAllCarousel() {
//        return carousels;
//    }
//
//    @Override
//    public void creatCarousel(Carousel carousel) {
//      carousels.add(carousel);
//    }
//
//    @Override
//    public void updateCarousel(int carouselId, Carousel carousel) {
//      for (int i=0;i<carousels.size();i++){
//          if (carousels.get(i).getCarouselId()==carouselId){
//              carousels.set(i,carousel);
//          }
//      }
//    }
//
//    @Override
//    public void deletCarousel(int carouselId) {
//      for (int i=0;i<carousels.size();i++){
//          if (carousels.get(i).getCarouselId()==carouselId){
//              carousels.remove(i);
//              break;
//          }
//      }
//    }
//}
