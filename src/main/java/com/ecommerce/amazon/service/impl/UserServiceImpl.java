package com.ecommerce.amazon.service.impl;

import com.ecommerce.amazon.model.User;
import com.ecommerce.amazon.repository.UserRepository;
import com.ecommerce.amazon.repository.impl.UserRepositoryImpl;
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
        return userRepository.getAllUser() ;
    }

    @Override
    public void creatUser(User user) {
        userRepository.creatUser(user);
    }

    @Override
    public void deletUser(Long userId) {
        userRepository.deletUser(userId);
    }

    @Override
    public void updateUser(long id, User user) {
        userRepository.updateUser(id,user);
    }


}
