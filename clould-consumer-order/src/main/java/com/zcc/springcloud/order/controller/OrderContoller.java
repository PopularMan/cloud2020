package com.zcc.springcloud.order.controller;


import domin.ApiCode;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class OrderContoller {

    private final RestTemplate restTemplate;

    public  static  final String SERVER_NAME ="http://CLOUD-PAYMENT-SERVICE";

    @RequestMapping("/getOrder/{orderId}")
    @ResponseBody
    public ApiCode getOrder(@PathVariable Integer orderId) {
        return this.restTemplate.getForObject(SERVER_NAME+"/search/1", ApiCode.class);
    }

}
