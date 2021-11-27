package com.healer1219.btarthaseurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * better-arthas eureka 服务中心
 *
 * @author lizewei
 * @date
 * @since 11
 * @version 0.1 - SNAPSHOT
 **/

@SpringBootApplication
@EnableEurekaServer
public class BtarthasEurekaserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(BtarthasEurekaserverApplication.class, args);
    }

}
