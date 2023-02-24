package com.client.ws.rasmooplus.mapper;

import com.client.ws.rasmooplus.dto.SubscriptionTypeDto;
import com.client.ws.rasmooplus.model.SubscriptionType;

/**
 * Esta classe serve para mapear os atributos de um objeto SubscriptionTypeDto para um objeto SubscriptionType
 * Pode ser chamada por qualquer classe que precise fazer essa conversão como por exemplo o métoo create ou update
 * da classe SubscriptionTypeServiceImpl
 * @Param SubscriptionTypeDto
 * @Return SubscriptionType
 */
public class SubscriptionTypeMapper {
    
    public static SubscriptionType fromDtoToEntity(SubscriptionTypeDto dto) {
        return SubscriptionType.builder()
            .id(dto.getId())
            .name(dto.getName())
            .accessMonths(dto.getAccessMonths())
            .price(dto.getPrice())
            .productKey(dto.getProductKey())
        .build();
    }
}
