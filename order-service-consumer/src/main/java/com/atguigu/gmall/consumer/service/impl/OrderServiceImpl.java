package com.atguigu.gmall.consumer.service.impl;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 苏晓虎
 * @Description:
 * @create 2020-05-04 17:23
 */
@Service //注意service注解dubbo也有一个
public class OrderServiceImpl implements OrderService {

    @Autowired
    private UserService userService;

    @Override
    public void initOrder(String userId) {
        System.out.println("用户id"+ userId);
        //1、查询用户的收货地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : userAddressList) {
            System.out.println(userAddress.getUserAddress());
        }

    }
}
