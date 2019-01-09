package com.huayu.user.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.huayu.user.dubbo.UserService;

/**
 * @author hushentao
 * @date 2019/1/9 13:42
 * @Description: TODO
 */
@Service //必须是dubbo下的Sservice
public class UserServiceImpl implements UserService {
    @Override
    public String getUserInfo(String name) {
        return "我是服务提供者：your name is " + name;
    }
}
