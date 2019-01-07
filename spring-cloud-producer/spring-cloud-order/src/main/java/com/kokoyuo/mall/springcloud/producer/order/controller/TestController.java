package com.kokoyuo.mall.springcloud.producer.order.controller;

import com.kokoyuo.mall.springcloud.producer.user.remote.UserRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author kokoyuo
 * Created on 2019/1/3.
 */
@RequestMapping("/test/")
@RestController
public class TestController {

    @Autowired
    private UserRemote userRemote;

    @GetMapping("hello/{name}")
    public String hello(@PathVariable("name") String name){

        return "order get user hello message:"+userRemote.hello(name);
    }

    @GetMapping("gettime")
    public String getTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }
}
