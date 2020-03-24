package cn.lvhaosir.sentinel.gateway.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lvhaosir 2020/3/23 10:51
 * @Description: TODO()
 * @Version v1.0
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class SentinelGatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelGatewayServiceApplication.class, args);
    }

}
