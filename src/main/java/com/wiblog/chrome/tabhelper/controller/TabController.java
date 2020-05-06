package com.wiblog.chrome.tabhelper.controller;


import com.wiblog.chrome.tabhelper.service.ITabService;

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
@RequestMapping("/tab")
public class TabController {

    private ITabService tabService;

    @Autowired
    public TabController(ITabService tabService){
        this.tabService = tabService;
    }


}
