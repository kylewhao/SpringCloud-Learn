package com.kylewh.mycloudeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author kylewhao
 */
@SpringBootApplication
@EnableEurekaClient
public class MycloudEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MycloudEurekaClientApplication.class, args);
    }

}
