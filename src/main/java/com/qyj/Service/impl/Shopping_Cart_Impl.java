package com.qyj.Service.impl;

import com.qyj.Entity.Shopping_Cart.Shopping_Cart;
import com.qyj.Entity.Shopping_Cart.Shopping_Cart_find;
import com.qyj.Mapper.Shopping_CartMapper;
import com.qyj.Service.Shopping_Cart_Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Shopping_Cart_Impl implements Shopping_Cart_Interface {

    @Autowired
    Shopping_CartMapper shopping_cartMapper;

    @Override
    public void insert(Shopping_Cart shopping_cart) {
        shopping_cartMapper.insert(shopping_cart);
    }

    @Override
    public void delete(int userId) {
        shopping_cartMapper.delete(userId);
    }

    @Override
    public void deleteByCommodityId(Shopping_Cart shopping_cart) {
        shopping_cartMapper.deleteByCommodityId(shopping_cart);
    }

    @Override
    public List<Shopping_Cart_find> findAll(int userId) {
        return shopping_cartMapper.findAll(userId);
    }

    @Override
    public void updateQuantityByCommodityId(Shopping_Cart shopping_cart) {
        shopping_cartMapper.updateQuantityByCommodityId(shopping_cart);
    }
}
