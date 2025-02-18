package com.ecommerce.amazon.repository;

import com.ecommerce.amazon.model.User;

import java.util.ArrayList;
import java.util.List;

public interface UserRepository {

  public  List<User>getAllUser();

public void creatUser(User user);

public  void updateUser(Long userId,User user);

public void deletUser(Long userId);
}
