package com.qyj.Controller.Custom;

import com.qyj.Entity.Order.Order_Custom;
import com.qyj.Entity.Order.Order_Custom_Simp;
import com.qyj.Entity.Order.Order_insert;
import com.qyj.Entity.Order.Order_update;
import com.qyj.Service.impl.Order_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/custom/order")
public class Custom_Order {

    @Autowired
    Order_Impl order_impl;

    @RequestMapping("/findSimplByUserId")
    public List<Order_Custom_Simp> findSimplByUserId(int userId){
        return order_impl.findSimplByUserId_Custom(userId);
    }

    @RequestMapping("/findByUserIdOrderCustomId")
    public Order_Custom findByUserIdOrderCustomId(Order_Custom_Simp order_custom_simp){
        return order_impl.findByUserIdOrderCustomId(order_custom_simp);
    }

    @RequestMapping("/deleteByOrderCustomId")
    public void deleteByOrderCustomId(Order_Custom_Simp order_custom_simp) {
        order_impl.deleteByOrderCustomId(order_custom_simp);
    }

    @RequestMapping("/insert")
    public void insert(Order_insert order_insert) {
        order_impl.insert(order_insert);
    }

    @RequestMapping("/update")
    public void update(Order_update order_update){
        order_impl.update(order_update);
    }

}
