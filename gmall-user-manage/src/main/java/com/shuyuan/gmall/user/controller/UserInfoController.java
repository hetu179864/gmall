package com.shuyuan.gmall.user.controller;


import com.shuyuan.gmall.bean.UserInfo;
import com.shuyuan.gmall.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("findAll")
    public List<UserInfo> findAll(){
        return userInfoService.findAll();
    }

    // springmvc 对象传值！
    // localhost:8080/findByUserInfo?id=
    // localhost:8080/findByUserInfo?name=
    // localhost:8080/findByUserInfo?id=xxx&name=xxx
    @RequestMapping("findByUserInfo")
    public List<UserInfo> findByUserInfo(UserInfo userInfo){
        return userInfoService.findUserInfo(userInfo);
    }

    @RequestMapping("findByNickName")
    public List<UserInfo> findByNickName(String nickName){
        return userInfoService.findByNickName(nickName);
    }

    // localhost:8080/addUser?name=xxx&nickName=xxx
    @RequestMapping("addUser")
    public void addUser(UserInfo userInfo){
        userInfoService.addUser(userInfo);
    }

    // localhost:8080/updUser?nickName=madaha&loginName=wangermazi
    // localhost:8080/updUser?id=4&email=wangermazi@qq.com
    @RequestMapping("updUser")
    public void updUser(UserInfo userInfo){
        userInfoService.updUser(userInfo);
    }
    // localhost:8080/delUser?loginName=zhangsan&nickName=haha
    @RequestMapping("delUser")
    public void delUser(UserInfo userInfo){
        userInfoService.delUser(userInfo);
    }


}