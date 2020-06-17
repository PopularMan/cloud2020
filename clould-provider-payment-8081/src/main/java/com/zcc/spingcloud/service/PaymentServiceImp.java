package com.zcc.spingcloud.service;


import com.zcc.spingcloud.domin.Payment;
import com.zcc.spingcloud.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PaymentServiceImp implements PaymentService {
    private final PaymentRepository paymentRepository;

    @Override
    public Payment getOne(Integer id) {
        return this.paymentRepository.findById(id).get();
    }

    @Override
    public Payment create(Payment payment) {
        return this.paymentRepository.save(payment);
    }

}
