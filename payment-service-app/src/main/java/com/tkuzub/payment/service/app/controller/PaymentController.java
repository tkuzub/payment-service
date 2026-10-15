package com.tkuzub.payment.service.app.controller;

import com.tkuzub.payment.service.app.model.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class PaymentController {
    private final Map<Long, Payment> payments = Map.of(
            1L, new Payment(1, 100.00),
            2L, new Payment(2, 200.00));

    @GetMapping("payments/{id}")
    public Payment getPaymentById(@PathVariable("id") Long id) {
        return payments.get(id);
    }

    @GetMapping("payments")
    public Collection<Payment> getAllPayments() {
        return payments.values();
    }
}
