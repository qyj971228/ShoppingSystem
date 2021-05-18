package com.qyj.Mapper;

import com.qyj.Entity.Label.Commodity_Label;

import java.util.List;

/**
 * commodities_labels表相关
 */
public interface Commodity_LabelMapper {

    /**
     * 根据商品ID,查找此商品的所有标签
     * @param commodityId 商品ID
     * @return 标签:label
     */
    List<String> findAllByCommodityId(int commodityId);

    /**
     * 根据标签ID,查找携带此标签的所有商品名称
     * @param labelId 标签ID
     * @return 商品名称:commodityName
     */
    List<String> findAllByLabelId(int labelId);

    /**
     * 根据商品ID和标签ID,删除指定商品的指定标签
     * @param commodity_label commodityId:商品ID,labelId:标签ID
     */
    void deleteByCommodityIdLabelId(Commodity_Label commodity_label);

    /**
     * 根据商品ID,删除指定商品的所有标签
     * @param commodityId 商品ID
     */
    void deleteAllByCommodityId(int commodityId);

    /**
     * 根据commodities_labels表ID,商品ID,标签ID
     * 更新指定commodities_labels表ID的商品ID和标签ID
     * @param commodity_label commodities_labels:表ID,commodityId:商品ID,labelId:标签ID
     */
    void updateByCommodityIdLabelId(Commodity_Label commodity_label);

    /**
     * 根据商品ID,标签ID,添加商品与标签的对应关系
     * @param commodity_label commodityId:商品ID,labelId:标签ID
     */
    void insertByCommodityIdLabelId(Commodity_Label commodity_label);

}
