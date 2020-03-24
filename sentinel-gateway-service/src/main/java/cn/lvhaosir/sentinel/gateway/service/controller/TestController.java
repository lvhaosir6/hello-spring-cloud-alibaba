package cn.lvhaosir.sentinel.gateway.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lvhaosir 2020/3/23 10:53
 * @Description: TODO()
 * @Version v1.0
 **/
@RestController
public class TestController {


    @GetMapping("/test")
    public String test() {
        return "test";
    }

}
