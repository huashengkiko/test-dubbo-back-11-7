package com.deepexi.service.impl;

import com.deepexi.model.entity.CrudDemoDO;
import com.deepexi.mapper.CrudDemoMapper;
import com.deepexi.service.CrudDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudDemoServiceImpl implements CrudDemoService {

    @Autowired
    private CrudDemoMapper mapper;

    @Override
    public List<CrudDemoDO> listAll() {
        return mapper.selectList(null);
    }

}
