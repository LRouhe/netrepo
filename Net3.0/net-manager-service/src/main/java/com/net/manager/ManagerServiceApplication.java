package com.net.manager;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo  //开启Dubbo
@SpringBootApplication
@MapperScan(basePackages = {"com.net.manager.mapper"})  //接口扫描
public class ManagerServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManagerServiceApplication.class,args);
    }
}
