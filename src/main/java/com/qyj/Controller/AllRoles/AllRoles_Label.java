package com.qyj.Controller.AllRoles;

import com.qyj.Entity.Label.Label;
import com.qyj.Service.impl.Label_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * passed
 */

@RestController
@RequestMapping("/allRoles/label")
public class AllRoles_Label {

    @Autowired
    Label_Impl label_impl;

    @RequestMapping("/findAll")
    public List<Label> findAll(){
        return label_impl.findAll();
    }

}
