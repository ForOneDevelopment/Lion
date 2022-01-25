package com.one.example.service.impl;

import com.one.example.dao.StaffMapper;
import com.one.example.entity.Staff;
import com.one.example.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffServiceImpl implements StaffService {

    // 注入Service依赖
    private final StaffMapper staffMapper;
    @Autowired
    public StaffServiceImpl(StaffMapper staffMapper) {
        this.staffMapper = staffMapper;
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return staffMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Staff record) {
        return staffMapper.insert(record);
    }

    @Override
    public int insertSelective(Staff record) {
        return 0;
    }

    @Override
    public Staff selectByPrimaryKey(Long id) {
        return selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Staff record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Staff record) {
        return updateByPrimaryKey(record);
    }
}
