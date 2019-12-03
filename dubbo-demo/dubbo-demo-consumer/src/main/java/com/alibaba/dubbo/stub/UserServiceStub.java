package com.alibaba.dubbo.stub;

import com.alibaba.dubbo.stub.dto.User;

/**
 * @author zheng haijain
 * @createTime 2019-12-03 14:50
 * @description
 */
public class UserServiceStub implements UserInterface {

    //必须定义这个接口，以便接收dubbo在调用远程服务生成的服务代理类
    private UserInterface userLocalService ;

    //这个构造函数必须要提供，dubbo框架会在消费者这一方调用这个方法
    public UserServiceStub(UserInterface userLocalService ) {
        this.userLocalService = userLocalService  ;
    }

    @Override
    public User getUserById(Long id) {
        User user = null;
        try {
            if (id.equals(2L)) {
                user = this.userLocalService.getUserById(id);
            } else {
                user = new User();
                user.setName("系统用户");
            }
        } catch (Exception e) {
            e.printStackTrace();
            user = new User();
            user.setName("异常用户");
        }
        return user;
    }
}
