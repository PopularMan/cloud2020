package com.zcc.spingcloud.controller;


import com.zcc.spingcloud.domin.Payment;
import com.zcc.spingcloud.service.PaymentService;
import domin.ApiCode;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class PaymentContoller {

    private final PaymentService paymentService;

    @Value("${server.port}")
    private Integer port;

    @RequestMapping("/create")
    @ResponseBody
    public ApiCode<Payment> create() {
        log.info("端口号:--------" + port);
        Payment payment = new Payment();
        payment.setName("张超吵");
        payment.setCreateDate(new Date());
        Map<String, String> obj = new HashMap<>();
        String uuid = UUID.randomUUID().toString();
        obj.put(uuid, "自动属性" + uuid);
        payment.setAttributes(obj);
        this.paymentService.create(payment);
        return new ApiCode<Payment>(HttpStatus.OK.value(), payment);

    }

    @RequestMapping("/search/{id}")
    @ResponseBody
    public ApiCode<Payment> search(@PathVariable Integer id) {
        return new ApiCode<Payment>(HttpStatus.OK.value(), port, this.paymentService.getOne(id));
    }


}
