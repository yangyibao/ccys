package com.cc.ys.serviceimpl;

import com.cc.ys.base.BaseServiceImpl;
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

        RoleVO roleVO = new RoleVO();
        roleVO.setId(1);
        roleVO.setName("manage");
        PermissionVO permissionVO = new PermissionVO();
        permissionVO.setId(1);
        permissionVO.setCode("a");
        permissionVO.setName("PA");
        permissionVO.setUrl("/pa");

        PermissionVO permissionVO1 = new PermissionVO();
        permissionVO1.setId(2);
        permissionVO1.setCode("b");
        permissionVO1.setName("PB");
        permissionVO1.setUrl("/pb");

        List<PermissionVO> list = new ArrayList<>();
        list.add(permissionVO);
        list.add(permissionVO1);
        roleVO.setPermissionVOList(list);
        if(null != userVO){
            userVO.setRoleVO(roleVO);
        }
        return userVO;
    }
}
