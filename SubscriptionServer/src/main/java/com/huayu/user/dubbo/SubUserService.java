package com.huayu.user.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;


@Component
public class SubUserService {

    @Reference
    private UserService mUserService;

    public String getUser(String name) {
        return mUserService.getUserInfo(name);
    }
}
