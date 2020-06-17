package com.zcc.alibaba.nacos.order;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosOrderApplication9003 {
    public static void main(String[] args) {
        SpringApplication.run(NacosOrderApplication9003.class);
    }
}
