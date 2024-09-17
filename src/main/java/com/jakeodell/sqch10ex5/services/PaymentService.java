package com.jakeodell.sqch10ex5.services;

import com.jakeodell.sqch10ex5.exceptions.NotEnoughMoneyException;
import com.jakeodell.sqch10ex5.models.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
