package com.cc.ys.service;

import com.cc.ys.model.UserVO;

import java.util.List;

public interface UserService {

    public List<UserVO> queryAll(String userName, String userNo);
}
