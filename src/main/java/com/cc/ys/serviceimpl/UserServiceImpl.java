package com.cc.ys.serviceimpl;

import com.cc.ys.base.BaseServiceImpl;
import com.cc.ys.mapper.PermissionVOMapper;
import com.cc.ys.mapper.UserMapper;
import com.cc.ys.model.PermissionVO;
import com.cc.ys.model.RoleVO;
import com.cc.ys.model.UserVO;
import com.cc.ys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl extends BaseServiceImpl<UserVO,UserMapper> implements UserService {

    @Autowired(required = false)
    public UserMapper userMapper;

    public UserServiceImpl(){
        setMapperClass(UserMapper.class);
    }

    @Override
    @Cacheable(cacheNames = "authority", key = "#username")
    public UserVO getUserByName(String userName) {
        UserVO userVO = userMapper.selectUserByName(userName);
        return userVO;
    }
}
