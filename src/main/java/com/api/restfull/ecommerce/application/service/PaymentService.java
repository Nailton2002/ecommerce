package com.api.restfull.ecommerce.application.service;

import com.api.restfull.ecommerce.application.request.CreditCardPaymentRequest;
import com.api.restfull.ecommerce.application.request.DebitCardPaymentRequest;
import com.api.restfull.ecommerce.application.request.PaymentRequest;
import com.api.restfull.ecommerce.application.request.PixPaymentRequest;
import com.api.restfull.ecommerce.application.response.PaymentResponse;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {

    @Transactional
    PaymentResponse processCreditCardPayment(CreditCardPaymentRequest request);

    @Transactional
    PaymentResponse processDebitCardPayment(DebitCardPaymentRequest request);

    @Transactional
    PaymentResponse processPixPayment(PixPaymentRequest request);


}
