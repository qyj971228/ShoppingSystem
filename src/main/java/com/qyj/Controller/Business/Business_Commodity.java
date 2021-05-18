package com.qyj.Controller.Business;

import com.qyj.Entity.Commodity.Commodity;
import com.qyj.Service.impl.Commodity_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * passed
 */

@RestController
@RequestMapping("/business/commodity")
public class Business_Commodity {

    @Autowired
    Commodity_Impl commodity_impl;

    @RequestMapping("/insert")
    public void insert(Commodity commodity){
        commodity_impl.insert(commodity);
    }

    @RequestMapping("/deleteById")
    public void deleteById(int commodityId){
        commodity_impl.deleteById(commodityId);
    }

    @RequestMapping("/update")
    public void update(Commodity commodity){
        commodity_impl.updateById(commodity);
    }

    @RequestMapping("/updateInventoryById")
    void updateInventoryById(Commodity commodity){
        commodity_impl.updateInventoryById(commodity);
    }

}
