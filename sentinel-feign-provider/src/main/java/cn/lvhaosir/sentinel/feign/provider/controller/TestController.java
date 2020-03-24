package cn.lvhaosir.sentinel.feign.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lvhaosir 2020/3/23 9:45
 * @Description: TODO()
 * @Version v1.0
 **/
@RestController
public class TestController {

    @GetMapping("/feign")
    public String feign() {
        return "hello sentinel feign";
    }

}
