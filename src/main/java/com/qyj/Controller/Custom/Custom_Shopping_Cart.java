package com.qyj.Controller.Custom;

import com.qyj.Entity.Shopping_Cart.Shopping_Cart;
import com.qyj.Entity.Shopping_Cart.Shopping_Cart_find;
import com.qyj.Service.impl.Shopping_Cart_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * passed
 */

@RestController
@RequestMapping("/custom/shoppingCart")
public class Custom_Shopping_Cart {

    @Autowired
    Shopping_Cart_Impl shopping_cart_impl;

    @RequestMapping("/insert")
    public void insert(Shopping_Cart shopping_cart){
        shopping_cart_impl.insert(shopping_cart);
    }

    @RequestMapping("/delete")
    public void delete(int userId){
        shopping_cart_impl.delete(userId);
    }

    @RequestMapping("/deleteByCommodityId")
    public void deleteByCommodityId(Shopping_Cart shopping_cart){
        shopping_cart_impl.deleteByCommodityId(shopping_cart);
    }

    @RequestMapping("/findAll")
    public List<Shopping_Cart_find> findAll(int userId){
        return shopping_cart_impl.findAll(userId);
    }

    @RequestMapping("/updateQuantityByCommodityId")
    public void updateQuantityByCommodityId(Shopping_Cart shopping_cart){
        shopping_cart_impl.updateQuantityByCommodityId(shopping_cart);
    }

}
