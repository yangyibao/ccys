package com.cc.ys.serviceimpl;

import com.cc.ys.base.BaseServiceImpl;
import com.cc.ys.mapper.PermissionVOMapper;
import com.cc.ys.model.PermissionVO;
import com.cc.ys.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl  extends BaseServiceImpl<PermissionVO, PermissionVOMapper> implements PermissionService {

    @Autowired(required = false)
    public PermissionVOMapper permissionVOMapper;

    public PermissionServiceImpl(){
        setMapperClass(PermissionVOMapper.class);
    }

    public List<PermissionVO> selectPermissionByRoleIds(List<Integer> list) {
        return permissionVOMapper.selectPermissionByRoleIds(list);
    }
}
