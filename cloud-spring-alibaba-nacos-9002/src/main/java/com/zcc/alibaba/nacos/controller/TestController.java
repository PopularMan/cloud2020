package com.zcc.alibaba.nacos.controller;

import domin.ApiCode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Value("${server.port}")
    Integer port;

    @GetMapping("/getPay")
    @ResponseBody
    public ApiCode getPay() {
        return new ApiCode<>(HttpStatus.OK.value(),port,"服务二");
    }
}
