package com.qyj.Controller.Business;

import com.qyj.Entity.Order.Order_Business;
import com.qyj.Entity.Order.Order_Business_Simp;
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
@RequestMapping("/business/order")
public class Business_Order {

    @Autowired
    Order_Impl order_impl;

    @RequestMapping("/findSimplByUserId")
    public List<Order_Business_Simp> findSimplByUserId(int userId){
        return order_impl.findSimplByUserId_Business(userId);
    }

    @RequestMapping("/findByUserIdOrderBusinessId")
    public Order_Business findByUserIdOrderBusinessId(int order_businessId){
        return order_impl.findByUserIdOrderBusinessId(order_businessId);
    }

    @RequestMapping("/deleteByOrderBusinessId")
    public void deleteByOrderBusinessId(Order_Business_Simp order_business_simp) {
        order_impl.deleteByOrderBusinessId(order_business_simp);
    }

}
