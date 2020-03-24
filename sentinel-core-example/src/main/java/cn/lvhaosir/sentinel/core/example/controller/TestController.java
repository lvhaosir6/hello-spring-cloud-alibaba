package cn.lvhaosir.sentinel.core.example.controller;

import cn.lvhaosir.sentinel.core.example.config.ExceptionUtil;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lvhaosir 2020/3/22 11:47
 * @Description: TODO()
 * @Version v1.0
 **/
@RestController
public class TestController {


    @RequestMapping("/hello")
    public String hello() {
        return "hello sentinel";
    }

    @RequestMapping("/resource")
    @SentinelResource(value = "resouces", blockHandler = "exHandler", blockHandlerClass = {ExceptionUtil.class})
    public String resource() {
        return "Sentinel resouces";
    }


}
