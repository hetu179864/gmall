package com.shuyuan.gmall.order.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.shuyuan.gmall.bean.UserAddress;
import com.shuyuan.gmall.service.UserInfoService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {


    @Reference
    private UserInfoService userInfoService;

    @RequestMapping("trade")
    @ResponseBody
    public List<UserAddress> trade(String userId){
        //得到用户收货地址
        return  userInfoService.fingUserAddressByUserId(userId);
    }

}
