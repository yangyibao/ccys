package com.cc.ys.model;

import java.util.List;

public class DatatablesVO<T> {

    private List<T> aaData;
    private  int iTotalDisplayRecords;
    private  int iTotalRecords;

    public DatatablesVO() {
    }

    public DatatablesVO(List<T> aaData, int iTotalRecords){
        this.aaData = aaData;
        this.iTotalRecords = iTotalRecords;
        this.iTotalDisplayRecords = iTotalRecords;
    }

    public List<T> getAaData() {
        return aaData;
    }
    public void setAaData(List<T> aaData) {
        this.aaData = aaData;
    }
    public int getiTotalDisplayRecords() {
        return iTotalDisplayRecords;
    }
    public void setiTotalDisplayRecords(int iTotalDisplayRecords) {
        this.iTotalDisplayRecords = iTotalDisplayRecords;
    }
    public int getiTotalRecords() {
        return iTotalRecords;
    }
    public void setiTotalRecords(int iTotalRecords) {
        this.iTotalRecords = iTotalRecords;
    }


}
