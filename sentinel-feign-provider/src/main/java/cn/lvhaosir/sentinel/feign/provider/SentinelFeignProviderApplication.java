package cn.lvhaosir.sentinel.feign.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author lvhaosir 2020/3/23 9:44
 * @Description: TODO()
 * @Version v1.0
 **/
@SpringCloudApplication
public class SentinelFeignProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelFeignProviderApplication.class, args);
    }


}
