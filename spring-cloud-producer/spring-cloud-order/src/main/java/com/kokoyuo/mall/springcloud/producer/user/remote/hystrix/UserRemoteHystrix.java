package com.kokoyuo.mall.springcloud.producer.user.remote.hystrix;

import com.kokoyuo.mall.springcloud.producer.user.remote.UserRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author kokoyuo
 * Created on 2019/1/4.
 */
@Component
public class UserRemoteHystrix implements UserRemote {
    @Override
    public String hello(@RequestParam("name") String name) {
        return "hello "+name+"welcome to default value for Hystrix !";
    }
}
