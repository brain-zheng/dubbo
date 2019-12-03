package com.alibaba.dubbo.stub.dto;

import java.io.Serializable;

/**
 * @author zheng haijain
 * @createTime 2019-12-03 14:44
 * @description
 */
public class User implements Serializable {

    private static final long serialVersionUID = 2632489966590399338L;

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
