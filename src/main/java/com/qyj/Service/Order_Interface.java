package com.qyj.Service;

import com.qyj.Entity.Order.*;

import java.util.List;

public interface Order_Interface {

    /**
     * 查找所有商家订单的预览信息
     * @return 所有商家订单的预览信息
     */
    List<Order_Business_Simp> findAll_Business();

    /**
     * 查找所有顾客订单的预览信息
     * @return 所有顾客订单的预览信息
     */
    List<Order_Custom_Simp> findAll_Custom();

    /**
     * 根据商家ID,查找当前商家所有订单的预览信息
     * @param userId 商家ID
     * @return 预览信息：Order_Business_Simp
     */
    List<Order_Business_Simp> findSimplByUserId_Business(int userId);

    /**
     * 根据顾客ID,查找当前顾客所有订单的预览信息
     * @param userId 顾客ID
     * @return 预览信息：Order_Custom_Simp
     */
    List<Order_Custom_Simp> findSimplByUserId_Custom(int userId);

    /**
     * 根据商家ID,订单ID,查找当前商家目标订单详细信息
     * @param order_business_simp 商家ID:userId,商家订单ID:order_businessId
     * @return 详细信息：Order_Business
     */
    Order_Business findByUserIdOrderBusinessId(Order_Business_Simp order_business_simp);

    /**
     * 根据顾客ID,订单ID,查找当前顾客目标订单详细信息
     * @param order_custom_simp 顾客ID:userId,顾客订单ID:order_customId
     * @return 详细信息：Order_Custom
     */
    Order_Custom findByUserIdOrderCustomId(Order_Custom_Simp order_custom_simp);

    /**
     * 根据商家订单ID,顾客订单ID,将数据插入,并在商品售出后,根据商品名称获取指定商品库存,更新为售出后商品的库存余额
     * @param order_insert
     */
    void insert(Order_insert order_insert);

    /**
     * 根据商家订单ID,删除订单
     * @param order_business_simp 商家订单ID:order_businessId
     */
    void deleteByOrderBusinessId(Order_Business_Simp order_business_simp);

    /**
     * 根据顾客订单ID,删除订单
     * @param order_custom_simp 顾客订单ID:order_customId
     */
    void deleteByOrderCustomId(Order_Custom_Simp order_custom_simp);

    /**
     * 根据商品名称,获取商家订单ID,顾客订单ID,再根据两个ID更新两个表中的顾客地址和顾客电话
     * @param order_update
     */
    void update(Order_update order_update);

}
