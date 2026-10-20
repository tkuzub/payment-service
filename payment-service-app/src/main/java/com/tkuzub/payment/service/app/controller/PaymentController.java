package com.tkuzub.payment.service.app.controller;

import com.tkuzub.payment.service.app.model.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class PaymentController {
    public static final Payment PAYMENT_1 = new Payment(1, 100.00);
    public static final Payment PAYMENT_2 = new Payment(2, 200.00);

    private final Map<Long, Payment> payments = Map.of(
            1L, PAYMENT_1,
            2L, PAYMENT_2);

    @GetMapping("payments/{id}")
    public Payment getPaymentById(@PathVariable("id") Long id) {
        return payments.get(id);
    }

    @GetMapping("payments")
    public List<Payment> getAllPayments() {
        return payments.values().stream().toList();
    }
}
