package cn.lvhaosir.sentinel.core.example.controller;

import cn.lvhaosir.sentinel.core.example.config.ExceptionUtil;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lvhaosir 2020/3/22 18:18
 * @Description: TODO()
 * @Version v1.0
 **/
@RestController
public class ParamController {

    @GetMapping("/param")
    @SentinelResource(value = "param", blockHandler = "exHandler", blockHandlerClass = {ExceptionUtil.class})
    public String param(String type) {
        return "success";
    }
}
