package cn.lvhaosir.sentinel.feign.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author lvhaosir 2020/3/23 9:50
 * @Description: TODO()
 * @Version v1.0
 **/
@FeignClient(value = "sentinel-feign-provider", fallback = TestFeginClientFallback.class )
public interface TestFeignClient {


    @GetMapping("/feign")
    String feign();

}
