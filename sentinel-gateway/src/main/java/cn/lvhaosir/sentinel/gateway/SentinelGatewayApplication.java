package cn.lvhaosir.sentinel.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author lvhaosir 2020/3/23 10:44
 * @Description: TODO()
 * @Version v1.0
 **/
@SpringCloudApplication
public class SentinelGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelGatewayApplication.class, args);
    }


}
