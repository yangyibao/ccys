package com.cc.ys.base;

import com.cc.ys.model.DatatablesVO;
import com.cc.ys.model.ParamVO;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseService<T,E> {

    public BaseMapper<T> getMapper();

    public T selectByPrimaryKey(Serializable id);

    public Map<String, Object> insert(T model);

    public Map<String, Object> insertSelective(T model);

    public Map<String, Object> updateByPrimaryKeySelective(T model);

    public Map<String, Object> updateByPrimaryKey(T model);

    public Map<String, Object> deleteByPrimaryKey(Serializable id);

    public List<T> selectDataList(ParamVO paramVO);

    public int selectDataNum(ParamVO paramVO);

    public DatatablesVO<T> selectPageList(ParamVO paramVO);

    public T selectByVO(T model);



}
