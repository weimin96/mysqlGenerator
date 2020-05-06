package com.wiblog.chrome.tabhelper.controller;


import com.wiblog.chrome.tabhelper.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 *  控制层
 *
 * @author pwm
 * @date 2020-05-06
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private IUserService userService;

    @Autowired
    public UserController(IUserService userService){
        this.userService = userService;
    }


}
