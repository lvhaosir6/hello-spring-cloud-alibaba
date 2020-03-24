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
public class SecurityController {


    @RequestMapping("/white")
    public String white() {
        return "hello white";
    }

    @RequestMapping("/black")
    public String black() {
        return "hello black";
    }


}
