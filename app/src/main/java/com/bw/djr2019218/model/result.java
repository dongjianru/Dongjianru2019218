package com.bw.djr2019218.model;

import java.util.ArrayList;

/**
 * @Auther: 董建茹
 * @Date: 2019/2/18 09:07:56
 * @Description:
 */
public class result {
    private ArrayList<JavaBean2> data;
     private  String pn;
    private  String rn;
    private  String totalNum;

    public result() {
    }

    public result(ArrayList<JavaBean2> data, String pn, String rn, String totalNum) {
        this.data = data;
        this.pn = pn;
        this.rn = rn;
        this.totalNum = totalNum;
    }

    public ArrayList<JavaBean2> getData() {
        return data;
    }

    public void setData(ArrayList<JavaBean2> data) {
        this.data = data;
    }

    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }

    public String getRn() {
        return rn;
    }

    public void setRn(String rn) {
        this.rn = rn;
    }

    public String getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(String totalNum) {
        this.totalNum = totalNum;
    }

    @Override
    public String toString() {
        return "result{" +
                "data=" + data +
                ", pn='" + pn + '\'' +
                ", rn='" + rn + '\'' +
                ", totalNum='" + totalNum + '\'' +
                '}';
    }
}
