package spingcloud.service;


import spingcloud.domin.Payment;

public interface PaymentService {
    Payment getOne(Integer id);

    Payment create(Payment payment);
}
