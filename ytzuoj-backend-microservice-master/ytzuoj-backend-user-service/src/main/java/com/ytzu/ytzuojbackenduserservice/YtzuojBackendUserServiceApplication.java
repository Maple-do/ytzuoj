package com.ytzu.ytzuojbackenduserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.ytzu.ytzuojbackenduserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.ytzu")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.ytzu.ytzuojbackendserviceclient.service"})
public class YtzuojBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(YtzuojBackendUserServiceApplication.class, args);
    }

}
