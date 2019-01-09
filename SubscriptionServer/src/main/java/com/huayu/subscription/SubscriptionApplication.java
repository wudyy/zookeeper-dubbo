package com.huayu.subscription;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hushentao
 * @date 2019/1/9 13:36
 * @Description: TODO
 */
@SpringBootApplication
public class SubscriptionApplication {

    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(SubscriptionApplication.class, args);
    }
}