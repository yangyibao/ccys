package com.cc.ys.base;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseMapper<T> {

    /**
     * 根据id查询对象
     * @param id 主键id
     * @return T
     */
    T selectByPrimaryKey(Serializable id);

    /**
     * 根据主键删除字段
     * @param id 主键
     * @return int
     */
    int deleteByPrimaryKey(Serializable id);

    /**
     * 增加对象(所有字段)
     * @param model 对象参数
     * @return int
     */
     int insert(T model);

    /**
     * 增加对象（根据传入字段）
     * @param model 对象参数
     * @return int
     */
    int  insertSelective(T model);

    /**
     * 修改对象(根据传入字段)
     * @param model 对象参数
     * @return int
     */
    int updateByPrimaryKeySelective(T model);

    /**
     * 修改对象(所有字段)
     * @param model 对象参数
     * @return int
     */
    int updateByPrimaryKey(T model);


    /**
     * 查询数据列表
     * @param map 参数
     * @return List<T>
     */
    public List<T> selectDataList(Map<String, Object> map);

    /**
     * 查询数据数目
     * @param map 参数
     * @return
     */
    public int selectDataNum(Map<String, Object> map);


    /**
     * 根据对象信息查询对象
     * @param model
     * @return
     */
    public T selectByVO(T model);


}
