package cn.lvhaosir.hello.spring.cloud.alibaba.example.controller;

import cn.lvhaosir.hello.spring.cloud.alibaba.example.dao.AboutRepository;
import cn.lvhaosir.hello.spring.cloud.alibaba.example.entity.About;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lvhaosir 2020/2/27 16:33
 * @Description: TODO()
 * @Version v1.0
 **/
@RestController
public class TestController {

    @Autowired
    private AboutRepository aboutRepository;

    @RequestMapping("/test")
    public String test() {
        List<About> all = aboutRepository.findAll();
        return all.toString();
    }

}
