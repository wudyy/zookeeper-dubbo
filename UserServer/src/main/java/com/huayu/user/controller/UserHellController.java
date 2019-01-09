package com.huayu.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hushentao
 * @date 2019/1/7 15:02
 * @Description: TODO
 */
@RestController
public class UserHellController {

    @GetMapping(value = "hello")
    public String hello() {
        return "hello this is  dubbo provider";
    }
}
