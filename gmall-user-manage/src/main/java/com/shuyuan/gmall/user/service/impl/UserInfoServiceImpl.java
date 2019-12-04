package com.shuyuan.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.shuyuan.gmall.bean.UserAddress;
import com.shuyuan.gmall.bean.UserInfo;
import com.shuyuan.gmall.service.UserInfoService;
import com.shuyuan.gmall.user.mapper.UserAddressMapper;
import com.shuyuan.gmall.user.mapper.UserInfoMapper;


import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    // 调用mapper!
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserAddressMapper userAddressMapper;

    @Override
    public List<UserAddress> fingUserAddressByUserId(String userId) {
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(userId);
        return userAddressMapper.select(userAddress);
    }

    @Override
    public List<UserAddress> fingUserAddressByUserId(UserAddress userAddress) {
        return userAddressMapper.select(userAddress);
    }

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserInfo> findUserInfo(UserInfo userInfo) {

        return userInfoMapper.select(userInfo);
    }

    @Override
    public List<UserInfo> findByNickName(String nickName) {
        // select * from user_info WHERE  nick_name LIKE '%a%';
        // 查询哪张表就给哪个实体类！
        Example example = new Example(UserInfo.class);
        // 构造查询条件
        // 第一个参数表示属性，第二个参数表示值！
        example.createCriteria().andLike("nickName","%"+nickName+"%");
        return   userInfoMapper.selectByExample(example);


    }

    @Override
    public void addUser(UserInfo userInfo) {

        userInfoMapper.insertSelective(userInfo);
    }

    @Override
    public void updUser(UserInfo userInfo) {
        // 按照用户的昵称nickName来修改loginName
        // update userInfo set loginName = ？ where nickName = ？
        // 第一个参数表示要修改的数据内容 ，第二个参数是跟什么修改：修改的条件
//        Example example = new Example(UserInfo.class);
//        example.createCriteria().andEqualTo("nickName",userInfo.getNickName());
//        userInfoMapper.updateByExampleSelective(userInfo,example);

        userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public void delUser(UserInfo userInfo) {
        // 常用！
        userInfoMapper.delete(userInfo);


    }
}
