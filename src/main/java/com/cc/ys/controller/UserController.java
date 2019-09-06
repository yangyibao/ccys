package com.cc.ys.controller;

import com.cc.ys.model.UserVO;
import com.cc.ys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("queryAll")
    @ResponseBody
    public List<UserVO> queryList(String userName, String userNo){
        return userService.queryAll(userName, userNo);
    }
}
