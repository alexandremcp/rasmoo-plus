package com.client.ws.rasmooplus.integration;

import com.client.ws.rasmooplus.dto.wsraspay.CustomerDto;
import com.client.ws.rasmooplus.dto.wsraspay.OrderDto;
import com.client.ws.rasmooplus.dto.wsraspay.PaymentDto;

public interface WsRaspayIntegration {

    // createCustomer faz a criação de um cliente na plataforma de pagamento da Raspay
    CustomerDto createCustomer(CustomerDto customerDto);

    // createOrder faz a criação de um pedido na plataforma de pagamento da Raspay
    OrderDto createOrder(OrderDto orderDto);

    // processPayment faz a criação de um pagamento na plataforma de pagamento da Raspay
    Boolean processPayment(PaymentDto paymentDto);
    
}
