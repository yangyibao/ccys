package com.cc.ys.service;

import com.cc.ys.base.BaseService;
import com.cc.ys.mapper.UserMapper;
import com.cc.ys.model.UserVO;

import java.util.List;

public interface UserService extends BaseService<UserVO, UserMapper> {

//    public List<UserVO> queryAll(String userName, String userNo);

    public UserVO getUserByName(String userName);
}
