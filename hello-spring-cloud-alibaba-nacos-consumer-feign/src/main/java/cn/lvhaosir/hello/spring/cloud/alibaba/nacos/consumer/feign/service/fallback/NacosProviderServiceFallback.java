package cn.lvhaosir.hello.spring.cloud.alibaba.nacos.consumer.feign.service.fallback;

import cn.lvhaosir.hello.spring.cloud.alibaba.nacos.consumer.feign.service.NacosProviderService;
import org.springframework.stereotype.Component;

/**
 * @author lvhaosir 2020/2/14 15:52
 * @Description: TODO()
 * @Version v1.0
 **/
@Component
public class NacosProviderServiceFallback implements NacosProviderService {
    @Override
    public String echo(String message) {
        return "你的网络出现问题，请检查";
    }
}
