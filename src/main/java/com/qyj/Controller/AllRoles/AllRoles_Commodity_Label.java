package com.qyj.Controller.AllRoles;

import com.qyj.Service.impl.Commodity_Label_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * passed
 */

@RestController
@RequestMapping("/allRoles/commodity_label")
public class AllRoles_Commodity_Label {

    @Autowired
    Commodity_Label_Impl commodity_label_impl;

    @RequestMapping("/findAllByCommodityId")
    List<String> findAllByCommodityId(int commodityId){
        return commodity_label_impl.findAllByCommodityId(commodityId);
    }

    @RequestMapping("/findAllByLabelId")
    List<String> findAllByLabelId(int labelId){
        return commodity_label_impl.findAllByLabelId(labelId);
    }


}
