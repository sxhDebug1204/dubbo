package com.atguigu.gmall.provider.service.impl;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @Author 苏晓虎
 * @Description:  1.将服务提供者注册到注册中心(暴露服务)
 *                  1)导入dubbo依赖(2.6.2)
 *                 2.让服务消费者去注册中心订阅服务提供者的服务地址
 * @create 2020-05-04 17:22
 */
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceImpl.....old...");
        UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
        UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "王老师", "010-56253825", "N");
        return Arrays.asList(address1,address2);
    }
}
