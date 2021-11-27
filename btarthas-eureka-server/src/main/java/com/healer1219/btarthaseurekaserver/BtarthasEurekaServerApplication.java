package com.healer1219.btarthaseurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BtarthasEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BtarthasEurekaServerApplication.class, args);
    }

}
