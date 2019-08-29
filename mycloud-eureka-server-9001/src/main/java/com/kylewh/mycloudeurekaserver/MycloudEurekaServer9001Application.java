package com.kylewh.mycloudeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author kylewhao
 */
@SpringBootApplication
@EnableEurekaServer
public class MycloudEurekaServer9001Application {

    public static void main(String[] args) {
        SpringApplication.run(MycloudEurekaServer9001Application.class, args);
    }

}
