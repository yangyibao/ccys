package com.cc.ys.model;

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
    private RoleVO roleVO;

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

    public RoleVO getRoleVO() {
        return roleVO;
    }

    public void setRoleVO(RoleVO roleVO) {
        this.roleVO = roleVO;
    }
}
