package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjianfa
 * @Api swaggerAPI @Api: 描述类/接口的主要用途
 */
@RestController
@Api(value = "系统首页", tags="首页模块")
public class MainController {

    /** @ApiOperation: 描述方法用途 */
    @ApiOperation(value = "获取用户列表", notes = "获取所有用户信息")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }
}
