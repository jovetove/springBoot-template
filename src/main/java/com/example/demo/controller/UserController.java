package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author zjianfa
 */
@RestController
@Api(value = "用户接口, mybatis-plus使用示例")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String hello(){
        User user = userService.selectById(1);
        System.out.println(user.toString());
        return "hello";
    }

    @RequestMapping(value = "/countUser", method = RequestMethod.GET)
    public String count(){
        int n = userService.coutAllUsers();
        System.out.println("系统用户数：" + n);
        return "hello";
    }
}
