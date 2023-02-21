package com.client.ws.rasmooplus.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.client.ws.rasmooplus.dto.SubscriptionTypeDto;
import com.client.ws.rasmooplus.exception.NotFoundException;
import com.client.ws.rasmooplus.model.SubscriptionType;
import com.client.ws.rasmooplus.repository.SubscriptionTypeRepository;
import com.client.ws.rasmooplus.service.SubscriptionTypeService;

@Service
public class SubscriptionTypeServiceImpl implements SubscriptionTypeService {

    private final SubscriptionTypeRepository subscriptionTypeRespository;

    SubscriptionTypeServiceImpl(SubscriptionTypeRepository subscriptionTypeRespository) {
        this.subscriptionTypeRespository = subscriptionTypeRespository;
    }
    
    @Override
    public List<SubscriptionType> findAll() {
        return subscriptionTypeRespository.findAll();
    }

    @Override
    public SubscriptionType findById(Long id) {
        Optional<SubscriptionType> optionalSubscriptionType = subscriptionTypeRespository.findById(id);
        if (optionalSubscriptionType.isEmpty()) {
            throw new NotFoundException("SubscriptionType Não encontrado");
        }
        return optionalSubscriptionType.get();
    }

    @Override
    public SubscriptionType create(SubscriptionTypeDto dto) {
        return subscriptionTypeRespository.save(SubscriptionType.builder()
            .id(dto.getId())
            .name(dto.getName())
            .accessMonth(dto.getAccessMonth())
            .price(dto.getPrice())
            .productKey(dto.getProductKey())
        .build());
    }

    @Override
    public SubscriptionType update(Long id, SubscriptionType subscriptionType) {
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }
    
}

/*
 * SubscriptionTypeServiceImpl
 * ***************************
 * Implementa a interface SubscriptionTypeService, fornecendo a lógica real por trás das operações de negócio.
 * 
 * 
 * SubscriptionType create
 * ***********************
 * Este é um método que implementa a interface "SubscriptionTypeService".
 * Ele recebe um objeto "SubscriptionTypeDto" como parâmetro e retorna um objeto "SubscriptionType" usando os valores desse objeto DTO.       
 * Em seguinda, ele chama o método "save" do repositório "SubscriptionTypeRepository" para salvar o objeto "SubscriptionType" no banco de dados.
 * 
 * O método "builder()" é usado para criar um objeto "SubscriptionType" usando o padrão de projeto "Builder".
 * Ele permite criar objetos complexos passo a passo, sem a necessidade de chamar muitos construtores diferentes com muitos argumentos.
 * 
 * Cada chamada do método no padrão builder é usada para definir um valor de atributo diferente para o objeto que está sendo criado. 
 * Por fim, a chamada do método "build()" é usada para criar o objeto completo "SubscriptionType".
 */
