package com.hm.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Merlin
 * @Title: NacosUserServiceApplication
 * @ProjectName springcloud-learning
 * @Description: TODO
 * @date 2020/8/2514:16
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosUserServiceApplication {


    public static void main(String[] args) {
        SpringApplication.run(NacosUserServiceApplication.class, args);
    }
}
