package com.example.demo.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;



/**
 * @author zjianfa
 * 添加 @Repository 可以使得后续自动注入不报错
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

    /**计算用户数量*/
    int coutUserNumber();
}
