package com.shuyuan.gmall.service;

import com.shuyuan.gmall.bean.UserAddress;
import com.shuyuan.gmall.bean.UserInfo;

import java.util.List;

public interface UserInfoService {

    /**
     * 根据用户id查询用户收货地址
     * @param userId
     * @return
     */
    List<UserAddress> fingUserAddressByUserId(String userId);

    /**
     * 根据用户id查询用户收货地址
     * @param userAddress
     * @return
     */
    List<UserAddress> fingUserAddressByUserId(UserAddress userAddress);
    /**
     * 返回所有数据
     * @return
     */
    List<UserInfo> findAll();

    // 想根据用户Id，或者用户的昵称或者根据用户的名称等多个不同的字段进行查询，如果什么都不输入，则查询所有？
    List<UserInfo> findUserInfo(UserInfo userInfo);

    // 模糊查询 nickName
    List<UserInfo> findByNickName(String nickName);

    /**
     * 添加数据
     * @param userInfo
     */
    void addUser(UserInfo userInfo);

    /**
     * 修改数据
     * @param userInfo
     */
    void updUser(UserInfo userInfo);



    /**
     * 删除数据
     * @param userInfo
     */
    void delUser(UserInfo userInfo);






}
