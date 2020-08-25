package com.hm.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Merlin
 * @Title: NacosConfigClientApplication
 * @ProjectName springcloud-learning
 * @Description: TODO
 * @date 2020/8/2517:10
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientApplication.class, args);
    }
}
