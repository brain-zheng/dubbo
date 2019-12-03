package com.alibaba.dubbo.stub.provider;

import com.alibaba.dubbo.stub.UserInterface;
import com.alibaba.dubbo.stub.dto.User;

/**
 * @author zheng haijain
 * @createTime 2019-12-03 14:46
 * @description
 */
public class UserService implements UserInterface {

    @Override
    public User getUserById(Long id) {
        User user  = new User() ;
        user.setId(id);
        user.setName("hu");
        return user;
    }

}
