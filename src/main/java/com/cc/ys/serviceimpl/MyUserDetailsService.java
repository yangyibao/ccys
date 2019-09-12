package com.cc.ys.serviceimpl;

import com.cc.ys.mapper.PermissionVOMapper;
import com.cc.ys.model.PermissionVO;
import com.cc.ys.model.RoleVO;
import com.cc.ys.model.UserVO;
import com.cc.ys.service.PermissionService;
import com.cc.ys.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
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

    protected Logger log = LogManager.getLogger(getClass().getName());

    @Resource
    private UserService userService;

    @Resource
    public PermissionService permissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserVO userVO = userService.getUserByName(username);
        if(userVO.getRoles().size() > 0){
            log.info("roleName:" + userVO.getRoles().get(0).getRoleName());
        }
        if(null == userVO){
            throw new UsernameNotFoundException(username);
        }
        List<Integer> paramList = new ArrayList<>();
        List<SimpleGrantedAuthority> authorityList = new ArrayList<>();
        for(RoleVO roleVO : userVO.getRoles()){
            paramList.add(roleVO.getRoleId());
            authorityList.add(new SimpleGrantedAuthority(roleVO.getRoleExt1()));
        }
        List<PermissionVO> list = permissionService.selectPermissionByRoleIds(paramList);

        for(PermissionVO permissionVO:list){
            authorityList.add(new SimpleGrantedAuthority(permissionVO.getCode()));
        }
        log.info("permissioinSize:" + authorityList.size());
        return new User(userVO.getUsername(),userVO.getPassword(),authorityList);
    }
}
