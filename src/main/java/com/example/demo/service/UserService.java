package com.example.demo.service;


import com.baomidou.mybatisplus.service.IService;
import com.example.demo.entity.User;


/**
 * @author zjianfa
 */
public interface UserService extends IService<User> {
    int coutAllUsers();
}
