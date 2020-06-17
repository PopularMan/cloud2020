package com.zcc.spingcloud.service;


import com.zcc.spingcloud.domin.Payment;

public interface PaymentService {
    Payment getOne(Integer id);

    Payment create(Payment payment);
}
