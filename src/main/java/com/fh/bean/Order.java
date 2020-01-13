package com.fh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("t_order")

public class Order {
    @TableId(value = "id", type = IdType.AUTO)
    private int id;
    private int sssid;
    private int count;
    private double subtotal;//小计金额
    private int iasel;//是否
    private double price;

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
