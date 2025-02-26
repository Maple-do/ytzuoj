package com.ytzu.ytzuojbackendquestionservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.ytzu.ytzuojbackendquestionservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.ytzu")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.ytzu.ytzuojbackendserviceclient.service"})
public class YtzuojBackendQuestionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(YtzuojBackendQuestionServiceApplication.class, args);
    }

}
