package com.duclong.thucung.service;

import com.duclong.thucung.dto.request.NewUserRequest;
import com.duclong.thucung.entity.User;
import com.duclong.thucung.reponsitory.UserReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserReponsitory userReponsitory;

    @Transactional
    public User createUser(NewUserRequest request){

        User user = new User();

        user.setName(request.getName());
        user.setPassword(request.getPassword());
        user.setDate(request.getDate());
        user.setEmail(request.getEmail());
        user.setIsAdmin(request.getIsAdmin());
        user.setNumber(request.getNumber());
        try {
            return userReponsitory.save(user);
        }
        catch (Exception ex){
            throw new RuntimeException("Lỗi khi tạo user: " + ex.getMessage());
        }
    }
    public List<User> getUsers(){
        return userReponsitory.findAll();
    }

    public User getUser(int id){
        return  userReponsitory.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

}
