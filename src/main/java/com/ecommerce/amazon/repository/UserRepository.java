package com.ecommerce.amazon.repository;

import com.ecommerce.amazon.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;
import java.util.List;

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
    public User findByUserName(String userName);
    public  User findByUserMobile(String userMobile);
}
