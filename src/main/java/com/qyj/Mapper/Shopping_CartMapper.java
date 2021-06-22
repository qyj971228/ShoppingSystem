package com.qyj.Mapper;

import com.qyj.Entity.Shopping_Cart.Shopping_Cart;
import com.qyj.Entity.Shopping_Cart.Shopping_Cart_find;

import java.util.List;

/**
 * shopping_carts表相关
 */
public interface Shopping_CartMapper {

    /**
     * 添加购物信息信息到购物车
     * @param shopping_cart 购物信息(顾客ID:userId,commodityId:商品ID,购买数量:quantity)
     */
    void insert(Shopping_Cart shopping_cart);

    /**
     * 根据顾客ID,删除购物车全部内容
     * @param userId 顾客ID
     */
    void delete(int userId);

    /**
     * 根据购物车id删除购物车内容
     * @param shoppingCartId 购物车id
     */
    void deleteById(int shoppingCartId);

    /**
     * 根据顾客ID,商品ID,删除指定顾客购物车内的指定商品
     * @param shopping_cart 顾客ID:userId,商品ID:commodityId
     */
    void deleteByCommodityId(Shopping_Cart shopping_cart);

    /**
     * 根据顾客ID,查找其购物车内商品和商家的详细信息
     * @param userId 顾客ID
     * @return 购物车内商品和商家的详细信息(shoppingCartId,userId, username,commodityId, commodityName,quantity,mobile,
     *          email,address,price,originAddress)
     */
    List<Shopping_Cart_find> findAll(int userId);

    /**
     * 根据顾客ID,商品ID,购物车内数量,更新购物车内指定顾客的商品的数量
     * @param shopping_cart 顾客ID:userId,商品ID:commodityId,购物车内数量:commodityId
     */
    void updateQuantityByCommodityId(Shopping_Cart shopping_cart);

}
