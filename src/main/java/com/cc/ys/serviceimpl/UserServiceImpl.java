package com.cc.ys.serviceimpl;

import com.cc.ys.mapper.UserMapper;
import com.cc.ys.model.UserVO;
import com.cc.ys.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    public UserMapper userMapper;

    @Override
    public List<UserVO> queryAll(String userName, String userNo) {
        Map<String,Object> map = new HashMap<>();
        map.put("userName",userName);
        map.put("userNo",userNo);
        return userMapper.selectAll(map);
    }
}
