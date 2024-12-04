package com.api.restfull.ecommerce.application.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PaymentResponse(
        Long id,
        OrderResponse order,
        BigDecimal value,
        String methodPayment, // Ex: "CARTÃO_CREDITO", "PIX", "BOLETO"
        String statusPayment, // Ex: "APROVADO", "REJEITADO"
        String numberTransaction,
        LocalDateTime dataPayment
) {


}
