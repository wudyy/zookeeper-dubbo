package com.huayu.subscription.controller;

import com.huayu.user.dubbo.SubUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SubHelloController {

    @Autowired
    private SubUserService mSubUserService;

    @GetMapping(value = "hello")
    public String hello(String name) {
        return "远程调用：" + mSubUserService.getUser(name);
    }

    @GetMapping(value = "hello1")
    public String haha() {
        return "我是消费者";
    }
}
