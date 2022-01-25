package com.one.example.dao;

import com.one.example.entity.Staff;

public interface StaffMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Staff record);

    int insertSelective(Staff record);

    Staff selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
}