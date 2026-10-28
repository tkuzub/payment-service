package com.tkuzub.payment.service.app.service;

import com.tkuzub.payment.service.app.dto.PaymentDto;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class PaymentService {

    private final Map<Long, PaymentDto> payments = Map.of(
            1L, new PaymentDto(100.00, "pending"),
            2L, new PaymentDto(200.00, "reject"));


    public PaymentDto getById(Long id) {
        return Optional.ofNullable(payments.get(id)).
                orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "payment not found with id " + id
                ));
    }

    public List<PaymentDto> getAll() {
        return new ArrayList<>(payments.values());
    }
}
