package com.cc.ys.service;

import com.cc.ys.base.BaseService;
import com.cc.ys.mapper.UserMapper;
import com.cc.ys.model.UserVO;


public interface UserService extends BaseService<UserVO, UserMapper> {
    public UserVO getUserByName(String userName);
}
