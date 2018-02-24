package com.bxz.service;

import com.bxz.dao.UserRepositoty;
import com.bxz.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SQ_BXZ on 2018-02-24.
 */
@Service
public class UserService {
    @Autowired
    private UserRepositoty userRepositoty;

    public User findUserByName(String name){
        User user = null;
        try{
            user = userRepositoty.findByUserName(name);
        }catch (Exception e){}
        return user;
    }
}
