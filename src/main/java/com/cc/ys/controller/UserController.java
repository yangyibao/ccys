package com.cc.ys.controller;

import com.cc.ys.model.DatatablesVO;
import com.cc.ys.model.ParamVO;
import com.cc.ys.model.UserVO;
import com.cc.ys.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {

    protected Logger log = LogManager.getLogger(getClass().getName());

    @Autowired
    public UserService userService;

    @RequestMapping("selectById")
    @ResponseBody
    public UserVO selectById(Integer userId){
       return  userService.selectById(userId);
    }

    @RequestMapping("add")
    @ResponseBody
    public Map<String, Object> add(UserVO userVO){
        log.info("userVO.name:"+userVO.getUsername());
        String passwd  = userVO.getPassword();
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        userVO.setPassword(encoder.encode(passwd));
        return userService.add(userVO);
    }

    @RequestMapping("addSelective")
    @ResponseBody
    public Map<String, Object> addSelective(UserVO userVO){
        return userService.addSelective(userVO);
    }

    @RequestMapping("updateByIdSelective")
    @ResponseBody
    public Map<String, Object> updateByIdSelective(UserVO userVO){
        return userService.updateByIdSelective(userVO);
    }

    @RequestMapping("updateById")
    @ResponseBody
    public Map<String, Object> updateById(UserVO userVO){
        return userService.updateById(userVO);
    }

    @RequestMapping("deleteById")
    @ResponseBody
    public Map<String, Object> deleteById(Integer userId){
        return userService.deleteById(userId);
    }

    @RequestMapping("selectDataList")
    @ResponseBody
    public List<UserVO> selectDataList(UserVO userVO){
        return userService.selectDataList(new ParamVO(null,null,"userVO",userVO));
    }

    @RequestMapping("selectDataNum")
    @ResponseBody
    public Map<String, Object> selectDataNum(UserVO userVO){
        Map<String, Object> map = new HashMap<>();
        int num =  userService.selectDataNum(new ParamVO(null,null,"userVO",userVO));
        map.put("num", num);
        return map;
    }

    @RequestMapping("selectPageList")
    @ResponseBody
    public DatatablesVO<UserVO> selectPageList(@RequestParam("iDisplayStart") Integer offset, @RequestParam("iDisplayLength") Integer pagesize, UserVO userVO){
        return userService.selectPageList(new ParamVO(offset,pagesize,"userVO",userVO));
    }

    @RequestMapping("selectByVO")
    @ResponseBody
    public UserVO selectByVO(UserVO userVO){
        return userService.selectByVO(userVO);
    }

}
