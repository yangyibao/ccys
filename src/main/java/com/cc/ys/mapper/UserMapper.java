package com.cc.ys.mapper;

import com.cc.ys.base.BaseMapper;
import com.cc.ys.model.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper extends BaseMapper<UserVO> {

    public List<UserVO> selectAll(Map<String,Object> map);

    public UserVO selectUserByName(String userName);
}
