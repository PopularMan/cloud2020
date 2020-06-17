package spingcloud.service;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spingcloud.domin.Payment;
import spingcloud.repository.PaymentRepository;

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
