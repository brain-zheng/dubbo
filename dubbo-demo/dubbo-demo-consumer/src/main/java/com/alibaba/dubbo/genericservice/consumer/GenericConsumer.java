package com.alibaba.dubbo.genericservice.consumer;


import com.alibaba.dubbo.rpc.service.GenericService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zheng haijain
 * @createTime 2019-12-03 13:37
 * @description
 */
public class GenericConsumer {

    public static void main(String[] args) {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-demo-consumer.xml"});
        context.start();

        /**
         * 从spring的上下文中读到”genericServiceDemo”之后却把它强转为GenericService的类，
         * 然后调用GenericService的$invoke的方法,该方法有三个参数:
         *      第一个参数是你调用远程接口的具体方法名
         *      第二个参数是helloService这个方法的入参的类型
         *      最后一个参数是值。
         */
        GenericService genericService = (GenericService) context.getBean("genericServiceDemo");
        Object result = genericService.$invoke("helloService",
                new String[]{"java.lang.String"},
                new Object[]{"hello"});

        System.out.println(result);

    }

}
