package com.qyj.Service.impl;

import com.qyj.Entity.Label.Commodity_Label;
import com.qyj.Mapper.Commodity_LabelMapper;
import com.qyj.Service.Commodity_Label_Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Commodity_Label_Impl implements Commodity_Label_Interface {

    @Autowired
    Commodity_LabelMapper commodity_labelMapper;

    @Override
    public List<String> findAllByCommodityId(int commodityId) {
        return commodity_labelMapper.findAllByCommodityId(commodityId);
    }

    @Override
    public List<String> findAllByLabelId(int labelId) {
        return commodity_labelMapper.findAllByLabelId(labelId);
    }

    @Override
    public void deleteByCommodityIdLabelId(Commodity_Label commodity_label) {
        commodity_labelMapper.deleteByCommodityIdLabelId(commodity_label);
    }

    @Override
    public void deleteAllByCommodityId(int commodityId) {
        commodity_labelMapper.deleteAllByCommodityId(commodityId);
    }

    @Override
    public void updateByCommodityIdLabelId(Commodity_Label commodity_label) {
        commodity_labelMapper.updateByCommodityIdLabelId(commodity_label);
    }

    @Override
    public void insertByCommodityIdLabelId(Commodity_Label commodity_label) {
        commodity_labelMapper.insertByCommodityIdLabelId(commodity_label);
    }
}
