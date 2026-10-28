package com.tkuzub.payment.service.app.controller;

import com.tkuzub.payment.service.app.dto.PaymentDto;
import com.tkuzub.payment.service.app.service.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/payments")
public class PaymentController {

    private final PaymentService paymentService;

    @GetMapping("/{id}")
    public PaymentDto getPaymentById(@PathVariable("id") Long id) {
        return paymentService.getById(id);
    }

    @GetMapping()
    public List<PaymentDto> getAllPayments() {
        return paymentService.getAll();
    }
}
