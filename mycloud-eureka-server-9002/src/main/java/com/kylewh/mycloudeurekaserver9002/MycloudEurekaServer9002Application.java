package com.kylewh.mycloudeurekaserver9002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author kylewhao
 */
@SpringBootApplication
@EnableEurekaServer
public class MycloudEurekaServer9002Application {

    public static void main(String[] args) {
        SpringApplication.run(MycloudEurekaServer9002Application.class, args);
    }

}
