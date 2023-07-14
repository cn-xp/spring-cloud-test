package com.test.service;

import com.test.mapper.TestMapper;
import com.test.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl {

    @Autowired
    private TestMapper testMapper;

    public Test getTest(String id) {
        return this.testMapper.getById(id);
    }
}
