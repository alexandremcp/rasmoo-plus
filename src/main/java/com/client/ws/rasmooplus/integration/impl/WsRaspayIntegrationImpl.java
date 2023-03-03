package com.client.ws.rasmooplus.integration.impl;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.client.ws.rasmooplus.dto.wsraspay.CustomerDto;
import com.client.ws.rasmooplus.dto.wsraspay.OrderDto;
import com.client.ws.rasmooplus.dto.wsraspay.PaymentDto;
import com.client.ws.rasmooplus.integration.WsRaspayIntegration;

@Component
public class WsRaspayIntegrationImpl implements WsRaspayIntegration {

    private RestTemplate restTemplate;

    // O restTemplate está sendo injetado pelo Spring através do construtor padrão da classe WsRaspayIntegrationImpl
    public WsRaspayIntegrationImpl() {
        restTemplate = new RestTemplate();
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        throw new UnsupportedOperationException("Unimplemented method 'createCustomer'");
    }

    @Override
    public OrderDto createOrder(OrderDto orderDto) {
        throw new UnsupportedOperationException("Unimplemented method 'createOrder'");
    }

    @Override
    public Boolean processPayment(PaymentDto paymentDto) {
        throw new UnsupportedOperationException("Unimplemented method 'processPayment'");
    }
    
}
