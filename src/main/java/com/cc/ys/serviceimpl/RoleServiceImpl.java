package com.cc.ys.serviceimpl;

import com.cc.ys.base.BaseServiceImpl;
import com.cc.ys.mapper.RoleVOMapper;
import com.cc.ys.model.RoleVO;
import com.cc.ys.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends BaseServiceImpl<RoleVO, RoleVOMapper> implements RoleService {
    public RoleServiceImpl(){
        setMapperClass(RoleVOMapper.class);
    }
}
