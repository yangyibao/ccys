package com.cc.ys.model;

import java.util.HashMap;
import java.util.Map;

public class ParamVO {

    private Integer offset;
    private Integer pageSize;
    private String className;
    private Object T;
    private Map<String,Object> pMap = new HashMap<>();

    public ParamVO(){

    }

    public ParamVO(Integer offset, Integer pageSize) {
        this.offset = offset;
        this.pageSize = pageSize;
    }
    public ParamVO(Integer offset, Integer pageSize, String className,  Object t){
        this.offset = offset;
        this.pageSize = pageSize;
        this.className = className;
        this.T = t;
    }
    /**
     * map中增加一个参数
     * @param key
     * @param val
     */
    public void addParam(String key,Object val){
        pMap.put(key, val);
    }

    /**
     * 获取分页数据-查询参数
     * @return
     */
    public Map<String, Object> getListParam(){
        Map<String, Object> map =  new HashMap<>();
        if(this.offset != null){
            map.put("offset", this.offset);
        }
        if(this.pageSize != null){
            map.put("pageSize", this.pageSize);
        }
        if(!pMap.isEmpty()){
            map.putAll(pMap);
        }
        if(className != null && (!"".equals(className))){
            map.put(className,T);
        }
        return map;
    }

    /**
     * 获取分页数据-统计参数
     * @return
     */
    public Map<String, Object> getCountParam(){
        Map<String, Object> map =  new HashMap<>();
        if(className != null && (!"".equals(className))){
            map.put(className,T);
        }
        return map;
    }

    public Integer getOffset() {
        return offset;
    }
    public void setOffset(Integer offset) {
        this.offset = offset;
    }
    public Integer getPageSize() {
        return pageSize;
    }
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public Object getT() {
        return T;
    }
    public void setT(Object t) {
        T = t;
    }
}
