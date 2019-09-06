package com.cc.ys.mapper;

import com.cc.ys.model.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper{

    public List<UserVO> selectAll(Map<String,Object> map);

}
