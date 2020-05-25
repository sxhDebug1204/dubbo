package com.atguigu.gmall.consumer;

import com.atguigu.gmall.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author 苏晓虎
 * @Description:
 * @create 2020-05-14 23:35
 */
public class OrderMainApplication {
    public static void main(String[] args) throws Exception {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:consumer.xml");
        OrderService orderService = classPathXmlApplicationContext.getBean(OrderService.class);
        orderService.initOrder("1");
        System.out.println("调用完成");
        System.in.read();
    }
}
