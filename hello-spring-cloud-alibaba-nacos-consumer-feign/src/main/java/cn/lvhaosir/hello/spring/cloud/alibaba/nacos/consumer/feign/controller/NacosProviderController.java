package cn.lvhaosir.hello.spring.cloud.alibaba.nacos.consumer.feign.controller;

import cn.lvhaosir.hello.spring.cloud.alibaba.nacos.consumer.feign.service.NacosProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lvhaosir 2020/2/14 11:33
 * @Description: TODO()
 * @Version v1.0
 **/
@RestController
public class NacosProviderController {

    @Autowired
    private NacosProviderService nacosProviderService;


    @GetMapping(value = "/echo/hi")
    public String echo() {
        return nacosProviderService.echo("Hi Feign");
    }

    @GetMapping("/echo/hi2")
    public String echo2() {
        return "Hello lv";
    }

}
