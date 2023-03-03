package com.client.ws.rasmooplus.integration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.client.ws.rasmooplus.dto.wsraspay.CustomerDto;
import com.client.ws.rasmooplus.integration.impl.WsRaspayIntegrationImpl;

@SpringBootTest
public class WsRaspayIntegrationImplTest {

    @Autowired
    private WsRaspayIntegrationImpl wsRaspayIntegration;

    @Test
    void createCustomerWhenDtoOk() {   
        CustomerDto dto = new CustomerDto(null, "41126543080", "teste@teste", "Felipe", "Alves");
        wsRaspayIntegration.createCustomer(dto);
    }
    
}
