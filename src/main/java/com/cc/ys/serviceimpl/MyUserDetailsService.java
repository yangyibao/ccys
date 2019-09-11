package com.cc.ys.serviceimpl;

import com.cc.ys.model.PermissionVO;
import com.cc.ys.model.RoleVO;
import com.cc.ys.model.UserVO;
import com.cc.ys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Resource
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserVO userVO = userService.getUserByName(username);
        if(null == userVO){
            throw new UsernameNotFoundException(username);
        }
        List<SimpleGrantedAuthority> authorityList = new ArrayList<>();
        RoleVO roleVO = userVO.getRoleVO();
        for(PermissionVO permissionVO:roleVO.getPermissionVOList()){
             authorityList.add(new SimpleGrantedAuthority(permissionVO.getCode()));
        }
        return new User(userVO.getUsername(),userVO.getPassword(),authorityList);
    }
}
