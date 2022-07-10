package com.liu.service;

import com.liu.dao.UserDao;
import com.liu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao dao;

    public List<User> query(){
        return dao.query();
    }

}
