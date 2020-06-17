package com.zcc.spingcloud.repository;

import com.zcc.spingcloud.domin.Payment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

    default List<Payment> findSomeOne() {
         return  null;
    }

}
