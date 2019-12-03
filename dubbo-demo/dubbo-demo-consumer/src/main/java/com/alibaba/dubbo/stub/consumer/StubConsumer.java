package com.alibaba.dubbo.stub.consumer;

import com.alibaba.dubbo.demo.DemoService;
import com.alibaba.dubbo.stub.UserInterface;
import com.alibaba.dubbo.stub.dto.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zheng haijain
 * @createTime 2019-12-03 14:57
 * @description
 */
public class StubConsumer {

    public static void main(String[] args) {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-demo-consumer.xml"});
        context.start();
        UserInterface userService = (UserInterface) context.getBean("userService"); // get remote service proxy

        while (true) {
            try {
                Thread.sleep(5000);
                User user = userService.getUserById(1L); // call remote method
                System.out.println(user); // get result

            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }

}
