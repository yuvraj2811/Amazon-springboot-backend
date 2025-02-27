package com.ecommerce.amazon.repository;

import com.ecommerce.amazon.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User,String> {

//  public  List<User>getAllUser();
//
//public void creatUser(User user);
//
//public  void updateUser(Long userId,User user);
//
//public void deletUser(Long userId);
//
//public User getUserByName(String userName);
//
//public User getUserByMobile(String userMobile);
    public Optional<User> findByUserName(String userName);
    public  Optional<User> findByUserMobile(String userMobile);//property name search
}
