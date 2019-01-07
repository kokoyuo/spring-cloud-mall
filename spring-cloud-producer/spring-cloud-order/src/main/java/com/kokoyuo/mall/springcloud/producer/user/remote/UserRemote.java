package com.kokoyuo.mall.springcloud.producer.user.remote;

import com.kokoyuo.mall.springcloud.producer.user.remote.hystrix.UserRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author kokoyuo
 * Created on 2019/1/3.
 */
@FeignClient(name = "spring-cloud-mall-user",fallback = UserRemoteHystrix.class)
public interface UserRemote {

    @GetMapping("/hello")
    String hello(@RequestParam("name") String name);
}
