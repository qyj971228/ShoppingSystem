package com.qyj.Mapper;

import com.qyj.Entity.Order.Order_Business;
import com.qyj.Entity.Order.Order_Business_Simp;
import com.qyj.Entity.Order.Order_insert;
import com.qyj.Entity.Order.Order_update;

import java.util.List;

/**
 * orders_business表相关
 */
public interface Order_BusinessMapper {

    /**
     * 查找所有商家订单的预览信息
     * @return 所有商家订单的预览信息
     */
    List<Order_Business_Simp> findAll();

    /**
     * 根据商家ID,查找当前商家所有订单的预览信息
     * @param userId 商家ID
     * @return 预览信息：Order_Business_Simp
     */
    List<Order_Business_Simp> findSimplByUserId(int userId);


    /**
     * 根据商家ID,订单ID,查找当前商家目标订单详细信息
     * @param order_business_simp 商家ID:userId,商家订单ID:order_businessId
     * @return 详细信息：Order_Business
     */
    Order_Business findByUserIdOrderBusinessId(Order_Business_Simp order_business_simp);

    /**
     * 插入订单信息
     * @param order_insert 订单信息:(userId_Business,customName,commodityName,commodityType,quantity,price,totalPrice,
     *             businessAddress,customAddress,customMobile,businessMobile,datetime)
     */
    void insert(Order_insert order_insert);

    /**
     * 根据商家订单ID,删除订单
     * @param order_business_simp 商家订单ID:order_businessId
     */
    void deleteByOrderBusinessId(Order_Business_Simp order_business_simp);

    /**
     * 根据商家订单ID,顾客电话,收获地址,更新对应订单的顾客电话和收货地址
     * @param order_update 商家订单ID:order_businessId,顾客电话:customMobile,收货地址:customAddress
     */
    void updateAddressMobileByOrderBusinessId(Order_update order_update);


}
