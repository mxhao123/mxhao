package com.fh.controller;

import com.fh.bean.ClassBean;
import com.fh.bean.Order;
import com.fh.service.OrderService;
import com.fh.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("order")
@CrossOrigin
public class OrderController {
    @Autowired
    private OrderService  orderService;




    @GetMapping("queryList")
    public PageBean<Book> queryList(PageBean<Book> page) {
        orderService.queryList(page);
        return page;
    }




    @PostMapping("/queryClassList")
    public Map queryClassList() {
        Map map = new HashMap();
        List<ClassBean> classList = orderService.queryClassList();
        map.put("data", classList);
        return map;
    }



    @RequestMapping("/addStu")
    public Order addStu(Order studentBean) {
        orderService.addDrug(studentBean);
        return studentBean;
    }


    @RequestMapping("queryStuById")
    public Map queryStuById(Integer id) {
        Map map = new HashMap();
        Order studentBean = orderService.queryStuById(id);
        map.put("data", studentBean);
        return map;
    }


    @RequestMapping("delStu")
    public void deleteDrug(Integer id) {
        orderService.delStu(id);
    }



    @RequestMapping("updateStu")
    @ResponseBody
    public Order updateStu(Order studentBean) {
        orderService.updateStu(studentBean);
        return studentBean;
    }

}
