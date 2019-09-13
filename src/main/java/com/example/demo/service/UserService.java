package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User>  getUserByName(String username) {
        return userDao.getUserByName(username);
    }

    public List<User> selectAllUser() {
        return userDao.findAllUser();
    }

    public void deleteService(String id) {
        userDao.deleteUser(id);
    }


}
