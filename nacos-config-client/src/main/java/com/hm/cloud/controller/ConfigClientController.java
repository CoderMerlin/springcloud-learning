package com.hm.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Merlin
 * @Title: TestConfig
 * @ProjectName springcloud-learning
 * @Description: TODO
 * @date 2020/8/2517:15
 */

@RefreshScope
@RestController
@RequestMapping("config")
public class ConfigClientController {

    @Value("${url}")
    private String url;

    @GetMapping("test")
    public String test(){
        return url;
    }
}
