package com.ecommerce.amazon.repository.impl;

import com.ecommerce.amazon.model.User;
import com.ecommerce.amazon.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {
   private List<User>users=new ArrayList<>();

    public UserRepositoryImpl(){
        users.add(new User(1,"Gaurav","gyuvraaj12@gmial.com","9345885455"));
        users.add(new User(2,"Abhishek","Abhishek12@gmial.com","993685455"));
    }


    @Override
    public List<User> getAllUser() {
        return users;
    }

    @Override
    public void creatUser(User user) {
        users.add(user);
    }

    @Override
    public void updateUser(Long userId, User user) {
      for (int i=0;i<users.size();i++){

          if (users.get(i).getUserId()==userId){
              users.set(i,user);
          }
      }
    }

    @Override
    public void deletUser(Long userId) {
        for (int i=0;i<users.size();i++){
            if (users.get(i).getUserId()==userId){
                users.remove(i);
                break;
            }
        }
    }

    @Override
    public User getUserByName(String userName) {
        for (int i=0;i<users.size();i++){
            if (users.get(i).getUserName().equals(userName)){
                return users.get(i);
            }
        }
        return null;
    }

    @Override
    public User getUserByMobile(String userMobile) {
        for (int i=0;i<users.size();i++){
            if(users.get(i).getUserMobile().equals(userMobile)){
                return users.get(i);
            }
        }
        return null;
    }


}
