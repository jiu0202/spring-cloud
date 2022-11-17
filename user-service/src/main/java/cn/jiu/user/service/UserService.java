package cn.jiu.user.service;

import cn.jiu.user.mapper.UserMapper;
import cn.jiu.user.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public User queryById(Long id) {
        return userMapper.findById(id);
    }
}