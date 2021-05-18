package com.qyj.Service.impl;

import com.qyj.Entity.Commodity.Commodity;
import com.qyj.Entity.Commodity.Complex_Select;
import com.qyj.Entity.Commodity.PriceRange;
import com.qyj.Mapper.CommodityMapper;
import com.qyj.Service.Commodity_Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Commodity_Impl implements Commodity_Interface {

    @Autowired
    CommodityMapper commodityMapper;

    @Override
    public List<Commodity> findAll() {
        return commodityMapper.findAll();
    }

    @Override
    public List<Commodity> findByCommodityName(String commodityName) {
        return commodityMapper.findByCommodityName(commodityName);
    }

    @Override
    public List<Commodity> findByOriginAddress(String originAddress) {
        return commodityMapper.findByOriginAddress(originAddress);
    }

    @Override
    public List<Commodity> findByPrice(PriceRange priceRange) {
        return commodityMapper.findByPrice(priceRange);
    }

    @Override
    public List<Commodity> findByUserId(int userId) {
        return commodityMapper.findByUserId(userId);
    }

    @Override
    public void insert(Commodity commodity) {
        commodityMapper.insert(commodity);
    }

    @Override
    public void deleteById(int commodityId) {
        commodityMapper.deleteById(commodityId);
    }

    @Override
    public void updateById(Commodity commodity) {
        commodityMapper.updateById(commodity);
    }

    @Override
    public void updateInventoryById(Commodity commodity) {
        commodityMapper.updateInventoryById(commodity);
    }

    @Override
    public List<Commodity> findByComplex(Complex_Select complex_select) {
        return commodityMapper.findByComplex(complex_select);
    }
}
