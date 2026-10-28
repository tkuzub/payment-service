package com.tkuzub.payment.service.app.dto;

import lombok.Builder;

@Builder
public record PaymentDto(Double value, String status) { }
