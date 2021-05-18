package com.qyj.Mapper;

import com.qyj.Entity.Order.*;

import java.util.List;

/**
 * orders_custom表相关
 */
public interface Order_CustomMapper {

    /**
     * 查找所有顾客订单的预览信息
     * @return 所有顾客订单的预览信息
     */
    List<Order_Custom_Simp> findAll();

    /**
     * 根据顾客ID,查找当前顾客所有订单的预览信息
     * @param userId 顾客ID
     * @return 预览信息：Order_Custom_Simp
     */
    List<Order_Custom_Simp> findSimplByUserId(int userId);

    /**
     * 根据顾客ID,订单ID,查找当前顾客目标订单详细信息
     * @param order_custom_simp 顾客ID:userId,顾客订单ID:order_customId
     * @return 详细信息：Order_Custom
     */
    Order_Custom findByUserIdOrderCustomId(Order_Custom_Simp order_custom_simp);

    /**
     * 插入订单信息
     * @param order_insert 订单信息:(userId_Business,businessName,commodityName,commodityType,quantity,price,totalPrice,
     *             businessAddress,customAddress,customMobile,businessMobile,datetime)
     */
    void insert(Order_insert order_insert);

    /**
     * 根据顾客订单ID,删除订单
     * @param order_custom_simp 顾客订单ID:order_customId
     */
    void deleteByOrderCustomId(Order_Custom_Simp order_custom_simp);

    /**
     * 根据顾客订单ID,顾客电话,收获地址,更新对应订单的顾客电话和收货地址
     * @param order_update 顾客订单ID:order_businessId,顾客电话:customMobile,收货地址:customAddress
     */
    void updateAddressMobileByOrderCustomId(Order_update order_update);

    /**
     * 根据商品名称,获取商家订单ID
     * @param commodityName 商品名称
     * @return 商家订单的ID:order_businessId
     */
    int findOrderBusinessIdByCommodityName(String commodityName);

    /**
     * 根据商品名称,获取顾客订单ID
     * @param commodityName 商品名称
     * @return 顾客订单的ID:order_customId
     */
    int findOrderCustomIdByCommodityName(String commodityName);


}
