package com.alibaba.dubbo.callback;

/**
 * @author zheng haijain
 * @createTime 2019-12-02 17:33
 * @description
 */
public interface CallbackService {

    void addListener(String key, CallbackListener listener);

}
