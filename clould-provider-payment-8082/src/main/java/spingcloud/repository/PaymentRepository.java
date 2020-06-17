package spingcloud.repository;

import org.springframework.data.repository.CrudRepository;
import spingcloud.domin.Payment;

import java.util.List;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

    default List<Payment> findSomeOne() {
         return  null;
    }

}
