package com.ecommerce.amazon.service;

import com.ecommerce.amazon.model.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUser();
    public void creatUser(User user);
     public void deletUser(String id);
    public void updateUser(String id,User user);
     public User getUserByName(String userName);
     public User getUserByMobile(String userMobile);
     public User getByUserId(String userId);
}
