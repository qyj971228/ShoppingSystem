package com.qyj.Service.impl;

import com.qyj.Entity.Label.Label;
import com.qyj.Mapper.LabelMapper;
import com.qyj.Service.Label_Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Label_Impl implements Label_Interface {

    @Autowired
    LabelMapper labelMapper;


    @Override
    public List<Label> findAll() {
        return labelMapper.findAll();
    }

    @Override
    public void insert(String label) {
        labelMapper.insert(label);
    }

    @Override
    public void deleteById(int labelId) {
        labelMapper.deleteById(labelId);
    }

    @Override
    public void updateLabelById(Label label) {
        labelMapper.updateLabelById(label);
    }
}
