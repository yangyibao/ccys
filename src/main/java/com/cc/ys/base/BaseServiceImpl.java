package com.cc.ys.base;

import com.cc.ys.model.DatatablesVO;
import com.cc.ys.model.ParamVO;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseServiceImpl<T,E> extends SqlSessionDaoSupport implements BaseService<T,E>{

    protected Logger log = LogManager.getLogger(getClass().getName());

    private Class<E> mapperClass;

    private SqlSessionFactory sessionFactory;

    public void setMapperClass(Class<E> mapperClass) {
        this.mapperClass = mapperClass;
    }

    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        sessionFactory = sqlSessionFactory;
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public BaseMapper<T> getMapper() {
        E baseMapper = sessionFactory.getConfiguration().getMapper(mapperClass, getSqlSession());
        return (BaseMapper<T>) baseMapper;
    }

    public T selectById(Serializable id) {
        return getMapper().selectById(id);
    }

    public Map<String, Object> add(T model) {
        return resultMap(getMapper().add(model));
    }

    public Map<String, Object> addSelective(T model) {
        return resultMap(getMapper().addSelective(model));
    }

    public Map<String, Object> updateByIdSelective(T model) {
        return resultMap(getMapper().updateByIdSelective(model));
    }

    public Map<String, Object> updateById(T model) {
        return resultMap(getMapper().updateById(model));
    }

    public Map<String, Object> deleteById(Serializable id) {
        return resultMap(getMapper().deleteById(id));
    }

    public List<T> selectDataList(ParamVO paramVO) {
        return getMapper().selectDataList(paramVO.getListParam());
    }

    public int selectDataNum(ParamVO paramVO) {
        return getMapper().selectDataNum(paramVO.getCountParam());
    }

    public DatatablesVO<T> selectPageList(ParamVO paramVO) {
        return new DatatablesVO<>(selectDataList(paramVO),selectDataNum(paramVO));
    }

    public Map<String, Object> resultMap(Integer feeId) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (feeId >= 1) {
            map.put("flg", true);
        } else {
            map.put("flg", false);
            map.put("errorMsg", "操作异常请查看日志！");
        }
        return map;
    }

    public T selectByVO(T model) {
        return getMapper().selectByVO(model);
    }

}
