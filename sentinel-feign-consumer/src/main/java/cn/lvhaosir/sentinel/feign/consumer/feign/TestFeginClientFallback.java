package cn.lvhaosir.sentinel.feign.consumer.feign;

import org.springframework.stereotype.Component;

/**
 * @author lvhaosir 2020/3/23 9:52
 * @Description: TODO()
 * @Version v1.0
 **/
@Component
public class TestFeginClientFallback implements TestFeignClient {

    @Override
    public String feign() {
        return "feign fallback";
    }
}
