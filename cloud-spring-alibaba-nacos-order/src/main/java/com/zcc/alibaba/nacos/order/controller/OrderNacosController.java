package com.zcc.alibaba.nacos.order.controller;

import domin.ApiCode;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RestController
public class OrderNacosController {
    private final RestTemplate restTemplate;

    @Value("${service.payment.provider}")
    private String serviceURL;

    @GetMapping("/order/getOrder/{id}")
    public ApiCode getOrder(@PathVariable Integer id){
        return this.restTemplate.getForObject(serviceURL+"/getPay", ApiCode.class);
    }
}
