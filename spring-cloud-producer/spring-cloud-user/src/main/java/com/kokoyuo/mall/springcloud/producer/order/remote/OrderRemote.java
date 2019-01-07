package com.kokoyuo.mall.springcloud.producer.order.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kokoyuo
 * Created on 2019/1/7.
 */
@RequestMapping("/test/")
@FeignClient(name = "spring-cloud-mall-order")
public interface OrderRemote {
    @GetMapping("gettime")
    String getTime();
}
