package com.qyj.Service.impl;

import com.qyj.Entity.Commodity.Commodity;
import com.qyj.Entity.Order.*;
import com.qyj.Entity.Shopping_Cart.Shopping_Cart;
import com.qyj.Mapper.CommodityMapper;
import com.qyj.Mapper.Order_BusinessMapper;
import com.qyj.Mapper.Order_CustomMapper;
import com.qyj.Mapper.Shopping_CartMapper;
import com.qyj.Service.Order_Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Order_Impl implements Order_Interface {


    @Autowired
    Order_CustomMapper order_customMapper;

    @Autowired
    Order_BusinessMapper order_businessMapper;

    @Autowired
    CommodityMapper commodityMapper;

    @Autowired
    Shopping_CartMapper shopping_cartMapper;

    @Override
    public List<Order_Business_Simp> findAll_Business() {
        return order_businessMapper.findAll();
    }

    @Override
    public List<Order_Custom_Simp> findAll_Custom() {
        return order_customMapper.findAll();
    }

    @Override
    public List<Order_Business_Simp> findSimplByUserId_Business(int userId) {
        return order_businessMapper.findSimplByUserId(userId);
    }

    @Override
    public List<Order_Custom_Simp> findSimplByUserId_Custom(int userId) {
        return order_customMapper.findSimplByUserId(userId);
    }

    @Override
    public Order_Business findByUserIdOrderBusinessId(int order_businessId) {
        return order_businessMapper.findByUserIdOrderBusinessId(order_businessId);
    }

    @Override
    public Order_Custom findByUserIdOrderCustomId(int order_customId) {
        return order_customMapper.findByUserIdOrderCustomId(order_customId);
    }

    @Override
    @Transactional
    public String insert(Order_insert order_insert) {

        int commodityId = 0;
        int inventory = 0;
        Commodity commodity = new Commodity();

        Commodity com = commodityMapper.findByCommodityName_specific(order_insert.getCommodityName());
        commodityId = com.getCommodityId();
        inventory = com.getInventory();

        int newInventory = inventory - order_insert.getQuantity();
        if(newInventory >= 0){
            commodity.setInventory(newInventory);
        }else{
            return "库存不足";
        }
        commodity.setCommodityId(commodityId);


        commodityMapper.updateInventoryById(commodity);

        order_customMapper.insert(order_insert);
        order_businessMapper.insert(order_insert);

        shopping_cartMapper.deleteById(order_insert.getShoppingCartId());
        return "购买成功";
    }

    @Override
    public void deleteByOrderBusinessId(Order_Business_Simp order_business_simp) {
        order_businessMapper.deleteByOrderBusinessId(order_business_simp);
    }

    @Override
    public void deleteByOrderCustomId(Order_Custom_Simp order_custom_simp) {
        order_customMapper.deleteByOrderCustomId(order_custom_simp);
    }

    @Override
    @Transactional
    public void update(Order_update order_update) {

        int order_customId = order_customMapper.findOrderCustomIdByCommodityName(order_update.getCommodityName());
        int order_businessId = order_customMapper.findOrderBusinessIdByCommodityName(order_update.getCommodityName());

        order_update.setOrder_businessId(order_businessId);
        order_update.setOrder_customId(order_customId);

        order_businessMapper.updateAddressMobileByOrderBusinessId(order_update);
        order_customMapper.updateAddressMobileByOrderCustomId(order_update);

    }
}
