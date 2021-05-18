package com.qyj.Mapper;

import com.qyj.Entity.Label.Label;

import java.util.List;

/**
 * 表label相关
 */
public interface LabelMapper {

    /**
     * 查找所有标签
     * @return 标签：label
     */
    List<Label> findAll();

    /**
     * 增加标签
     * @param label 标签
     */
    void insert(String label);

    /**
     * 根据标签ID,删除标签
     * @param labelId 标签ID
     */
    void deleteById(int labelId);

    /**
     * 根据标签ID,修改标签
     * @param label 标签ID:labelId,标签:label
     */
    void updateLabelById(Label label);
}
