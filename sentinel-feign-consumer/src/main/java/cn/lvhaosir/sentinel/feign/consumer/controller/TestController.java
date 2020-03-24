package cn.lvhaosir.sentinel.feign.consumer.controller;

import cn.lvhaosir.sentinel.feign.consumer.feign.TestFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lvhaosir 2020/3/23 9:45
 * @Description: TODO()
 * @Version v1.0
 **/
@RestController
public class TestController {

    @Autowired
    private TestFeignClient testFeignClient;

    @RequestMapping("/hello")
    public String feign() {
        return testFeignClient.feign();
    }

}
