package com.alibaba.dubbo.callback.consumer;


import com.alibaba.dubbo.callback.CallbackListener;
import com.alibaba.dubbo.callback.CallbackService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zheng haijain
 * @createTime 2019-12-02 17:53
 * @description
 */
public class CallbackConsumer {

    public static void main(String[] args){
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-demo-consumer.xml"});
        context.start();

        CallbackService callbackService = (CallbackService) context.getBean("callbackService");

        callbackService.addListener("foo.bar", new CallbackListener(){
            public void changed(String msg) {
                System.out.println("callback1:" + msg);
            }
        });
    }

}
