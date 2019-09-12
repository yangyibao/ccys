package com.cc.ys.mapper;

import com.cc.ys.base.BaseMapper;
import com.cc.ys.model.PermissionVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PermissionVOMapper extends BaseMapper<PermissionVO> {

    public List<PermissionVO> selectPermissionByRoleIds(List<Integer> list);

}