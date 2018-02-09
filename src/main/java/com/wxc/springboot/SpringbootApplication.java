package com.wxc.springboot;

import com.wxc.controller.RoleController;
import com.wxc.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages={"com.wxc.controller","com.wxc.springboot"})//##加扫描的路径，默认扫启动类的包
@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootApplication.class, args);



    }
}
