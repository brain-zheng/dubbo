package com.alibaba.dubbo.genericservice.provider;

import com.alibaba.dubbo.genericservice.GenericService;

/**
 * @author zheng haijain
 * @createTime 2019-12-03 13:15
 * @description
 */
public class GenericServiceImpl implements GenericService {

    @Override
    public String helloService(String name) {
        System.out.println("name is "+ name);
        return "hello " + name;
    }

}
