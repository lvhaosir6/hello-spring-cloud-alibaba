package cn.lvhaosir.sentinel.feign.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lvhaosir 2020/3/23 9:44
 * @Description: TODO()
 * @Version v1.0
 **/
@EnableFeignClients
@SpringCloudApplication
public class SentinelFeignConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelFeignConsumerApplication.class, args);
    }


}
