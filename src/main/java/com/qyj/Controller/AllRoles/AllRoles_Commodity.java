package com.qyj.Controller.AllRoles;

import com.qyj.Entity.Commodity.Commodity;
import com.qyj.Entity.Commodity.Complex_Select;
import com.qyj.Entity.Commodity.PriceRange;
import com.qyj.Service.impl.Commodity_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * passed
 */

@RestController
@RequestMapping("/allRoles/commodity")
public class AllRoles_Commodity {

    @Autowired
    Commodity_Impl commodity_impl;

    @RequestMapping("/findAll")
    public List<Commodity> findAll(){
        return commodity_impl.findAll();
    }

    @RequestMapping("/findByCommodityName")
    public List<Commodity> findByCommodityName(String commodityName){
        return commodity_impl.findByCommodityName(commodityName);
    }

    @RequestMapping("/findByOriginAddress")
    public List<Commodity> findByOriginAddress(String originAddress){
        return commodity_impl.findByOriginAddress(originAddress);
    }

    @RequestMapping("/findByPrice")
    public List<Commodity> findByPrice(PriceRange priceRange){
        return commodity_impl.findByPrice(priceRange);
    }

    @RequestMapping("/findByUserId")
    public List<Commodity> findByUserId(int userId){
        return commodity_impl.findByUserId(userId);
    }

    @RequestMapping("/findByComplex")
    public List<Commodity> findByComplex(Complex_Select complex_select){
        return commodity_impl.findByComplex(complex_select);
    }

}
