package com.cn.service;

import com.cn.mapper.TestMapper;
import com.cn.model.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {


    @Autowired
    private TestMapper testMapper;





    @Override
    public List<TestBean> queryTest() {

        return testMapper.queryTest();
    }
}
