package com.kokoyuo.mall.springcloud.producer.user.controller;

import com.kokoyuo.mall.springcloud.producer.order.remote.OrderRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author kokoyuo
 * Created on 2018/12/29.
 */
@RestController
public class UserController {

    @Autowired
    private OrderRemote orderRemote;

    @GetMapping("hello")
    public String hello(@RequestParam("name") String name)
    {
        return name+",hello spring-cloud world !";
    }

    @GetMapping("getordertime")
    public String getOrderTime(){
        return "this is a time from order :"+orderRemote.getTime();
    }
}
