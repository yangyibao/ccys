package com.cc.ys.base;

import com.cc.ys.model.DatatablesVO;
import com.cc.ys.model.ParamVO;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseService<T,E> {

    public BaseMapper<T> getMapper();

    public T selectById(Serializable id);

    public Map<String, Object> add(T model);

    public Map<String, Object> addSelective(T model);

    public Map<String, Object> updateByIdSelective(T model);

    public Map<String, Object> updateById(T model);

    public Map<String, Object> deleteById(Serializable id);

    public List<T> selectDataList(ParamVO paramVO);

    public int selectDataNum(ParamVO paramVO);

    public DatatablesVO<T> selectPageList(ParamVO paramVO);

    public T selectByVO(T model);



}
