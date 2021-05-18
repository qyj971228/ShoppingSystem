package com.qyj.Controller.Business;

import com.qyj.Entity.Label.Commodity_Label;
import com.qyj.Service.impl.Commodity_Label_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * passed
 */

@RestController
@RequestMapping("/business/commodity_label")
public class Business_Commodity_Label {

    @Autowired
    Commodity_Label_Impl commodity_label_impl;

    @RequestMapping("/deleteByCommodityIdLabelId")
    void deleteByCommodityIdLabelId(Commodity_Label commodity_label){
        commodity_label_impl.deleteByCommodityIdLabelId(commodity_label);
    }

    @RequestMapping("/deleteAllByCommodityId")
    void deleteAllByCommodityId(int commodityId){
        commodity_label_impl.deleteAllByCommodityId(commodityId);
    }

    @RequestMapping("/updateByCommodityIdLabelId")
    void updateByCommodityIdLabelId(Commodity_Label commodity_label){
        commodity_label_impl.updateByCommodityIdLabelId(commodity_label);
    }

    @RequestMapping("/insertByCommodityIdLabelId")
    void insertByCommodityIdLabelId(Commodity_Label commodity_label){
        commodity_label_impl.insertByCommodityIdLabelId(commodity_label);
    }
}
