package com.ecommerce.amazon.service.impl;

import com.ecommerce.amazon.exception.ResourceNotFoundException;
import com.ecommerce.amazon.model.User;
import com.ecommerce.amazon.repository.UserRepository;
import com.ecommerce.amazon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
//UserRepositoryImpl userRepository =new UserRepositoryImpl();

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll() ;
    }

    @Override
    public void creatUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deletUser(String userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public void updateUser(String userId, User user) {
       // userRepository.save(user);
  User updateToUser = getByUserId(userId);
  if (updateToUser.getUserId()!=null){
//      updateToUser.setUserId(user.getUserId());
//      updateToUser.setUserName(user.getUserName());
//      updateToUser.setUserEmail(user.getUserEmail());
//      updateToUser.setUserMobile(user.getUserMobile());
      userRepository.save(user);
  }
    }

    @Override
    public User getUserByName(String userName) {
        return userRepository.findByUserName(userName).orElseThrow(()->new ResourceNotFoundException("User is not found"));
    }

    @Override
    public User getUserByMobile(String userMobile)
    {
        return userRepository.findByUserMobile(userMobile).orElseThrow(()->new ResourceNotFoundException("User is not found"));
    }

    @Override
    public User getByUserId(String userId) {
        return userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User is not found "));
    }


}
