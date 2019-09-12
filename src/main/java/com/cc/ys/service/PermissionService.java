package com.cc.ys.service;

import com.cc.ys.base.BaseService;
import com.cc.ys.mapper.PermissionVOMapper;
import com.cc.ys.model.PermissionVO;

import java.util.List;

public interface PermissionService extends BaseService<PermissionVO, PermissionVOMapper> {

    public List<PermissionVO> selectPermissionByRoleIds(List<Integer> list);

}
