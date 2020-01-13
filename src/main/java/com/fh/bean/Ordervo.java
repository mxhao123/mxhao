package com.fh.bean;

public class Ordervo {
    private int id;
    private int sssid;
    private int count;
    private double subtotal;//小计金额
    private int iasel;//是否
    private String classname;

    private double price;

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSssid() {
        return sssid;
    }

    public void setSssid(int sssid) {
        this.sssid = sssid;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public int getIasel() {
        return iasel;
    }

    public void setIasel(int iasel) {
        this.iasel = iasel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
