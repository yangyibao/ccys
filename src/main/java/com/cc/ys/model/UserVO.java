package com.cc.ys.model;

import java.util.List;

/**
 * @tip 账户相关实体类
 * @author  ys
 */
public class UserVO {
    //用户id
    private  int userId;
    //用户名
    private String username;
    //账号
    private String userNo;
    //密码
    private String password;
    //角色
    private List<RoleVO> roles;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<RoleVO> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleVO> roles) {
        this.roles = roles;
    }
}
