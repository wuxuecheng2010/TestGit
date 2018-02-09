package com.wxc.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @RequestMapping(value = "/getRoleName", method = RequestMethod.GET)
    public String getRoleName() {

        return "Role1";

    }
}
