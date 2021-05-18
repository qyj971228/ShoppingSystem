package com.qyj.Controller.Root;

import com.qyj.Entity.Label.Label;
import com.qyj.Service.impl.Label_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * passed
 */

@RestController
@RequestMapping("/root/label")
public class Root_Label {

    @Autowired
    Label_Impl label_impl;

    @RequestMapping("/insert")
    public void insert(String label){
        label_impl.insert(label);
    }

    @RequestMapping("/deleteById")
    public void deleteById(int labelId){
        label_impl.deleteById(labelId);
    }

    @RequestMapping("/updateById")
    public void updateById(Label label){
        label_impl.updateLabelById(label);
    }



}
