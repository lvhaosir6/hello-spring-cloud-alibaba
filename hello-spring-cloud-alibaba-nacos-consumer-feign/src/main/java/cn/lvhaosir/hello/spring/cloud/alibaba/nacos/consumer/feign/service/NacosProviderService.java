package cn.lvhaosir.hello.spring.cloud.alibaba.nacos.consumer.feign.service;

import cn.lvhaosir.hello.spring.cloud.alibaba.nacos.consumer.feign.service.fallback.NacosProviderServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author lvhaosir 2020/2/14 11:31
 * @Description: TODO()
 * @Version v1.0
 **/
@FeignClient(value = "nacos-provider", fallback = NacosProviderServiceFallback.class)
public interface NacosProviderService {

    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable(value = "message") String message);
}
