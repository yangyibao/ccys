package com.cc.ys.model;

/**
 * @tip 账户相关实体类
 * @author  ys
 */
public class UserVO {
    //用户id
    private  int userId;
    //用户名
    private String userName;
    //账号
    private String userNo;
    //密码
    private String password;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
}
