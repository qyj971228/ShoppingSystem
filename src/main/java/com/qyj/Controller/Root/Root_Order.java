package com.qyj.Controller.Root;

import com.qyj.Entity.Order.Order_Business_Simp;
import com.qyj.Entity.Order.Order_Custom_Simp;
import com.qyj.Service.impl.Order_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * passed
 */

@RestController
@RequestMapping("/root/order")
public class Root_Order {

    @Autowired
    Order_Impl order_impl;

    @RequestMapping("/findAll_Business")
    public List<Order_Business_Simp> findAll_Business(){
        return order_impl.findAll_Business();
    }

    @RequestMapping("/findAll_Custom")
    public List<Order_Custom_Simp> findAll_Custom(){
        return order_impl.findAll_Custom();
    }

}
