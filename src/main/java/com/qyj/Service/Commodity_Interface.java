package com.qyj.Service;

import com.qyj.Entity.Commodity.Commodity;
import com.qyj.Entity.Commodity.Complex_Select;
import com.qyj.Entity.Commodity.PriceRange;

import java.util.List;

public interface Commodity_Interface {

    /**
     * 查找所有商品信息
     * @return 商品信息:Commodity
     */
    List<Commodity> findAll();

    /**
     * 根据商品名称查找商品信息(模糊查询),查询逻辑:'%name%'
     * @param commodityName 商品名称
     * @return 商品信息:Commodity
     */
    List<Commodity> findByCommodityName(String commodityName);

    /**
     * 根据商品产地查找商品信息(模糊),查询逻辑:'%name%'
     * @param originAddress 商品产地
     * @return 商品信息:Commodity
     */
    List<Commodity> findByOriginAddress(String originAddress);

    /**
     * 根据价格区间查找商品信息,查询逻辑:between and 左右包含
     * @param priceRange low:最小价格,high:最高价格
     * @return 商品信息:Commodity
     */
    List<Commodity> findByPrice(PriceRange priceRange);

    /**
     * 根据商家id查找商品信息
     * @param userId 商家ID:userId
     * @return 商品信息:Commodity
     */
    List<Commodity> findByUserId(int userId);

    /**
     * 根据综合信息查找商品信息
     * @param complex_select 可选参数:商品名称:commodityName,商品产地:originAddress,商品价格范围:低:low,高:high
     * @return 商品信息:Commodity
     */
    List<Commodity> findByComplex(Complex_Select complex_select);

    /**
     * 增加商品信息
     * @param commodity 商品信息(userId, commodityName, price, inventory, originAddress)
     */
    void insert(Commodity commodity);

    /**
     * 根据商品ID,删除商品信息
     * @param commodityId 商品ID
     */
    void deleteById(int commodityId);

    /**
     * 根据商品ID,修改商品信息
     * @param commodity 商品ID:commodityId,商品信息(userId, commodityName, price, inventory, originAddress)
     */
    void updateById(Commodity commodity);

    /**
     * 根据商品ID,库存,修改库存
     * @param commodity 商品ID:commodityId,库存:inventory
     */
    void updateInventoryById(Commodity commodity);


}
