package com.wxc.controller;

import com.wxc.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @RequestMapping(value = "/getUserName", method = RequestMethod.GET)
    public List getUserName() {
        System.out.println("wuxuecheg");
        List<User> list = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            User u = new User();
            u.setAge(10 + i * 3);
            u.setUsername("wuxuecheng" + i);
            u.setPassword("" + i);
            list.add(u);
        }

        return list;
    }


}
