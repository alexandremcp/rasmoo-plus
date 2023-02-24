package com.client.ws.rasmooplus.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.client.ws.rasmooplus.dto.SubscriptionTypeDto;
import com.client.ws.rasmooplus.exception.BadRequestException;
import com.client.ws.rasmooplus.exception.NotFoundException;
import com.client.ws.rasmooplus.mapper.SubscriptionTypeMapper;
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

    

    /**
     * Este método é chamado pelo método findById da classe SubscriptionTypeController
     * que por sua vez é chamado pelo método findById da classe SubscriptionTypeResource
     * Ele retorna um objeto SubscriptionType através da chamada do método getSubscriptionType
     */
    @Override
    public SubscriptionType findById(Long id) {
        return getSubscriptionType(id);
    }



    @Override
    public SubscriptionType create(SubscriptionTypeDto dto) {
        if (Objects.nonNull(dto.getId())) {
            throw new BadRequestException("Id deve ser nulo");
        }
        return subscriptionTypeRespository.save(SubscriptionTypeMapper.fromDtoToEntity(dto));
    }

    /**
     * Este método é chamado pelo método update da classe SubscriptionTypeController
     * que por sua vez é chamado pelo método update da classe SubscriptionTypeResource
     * Ele retorna um objeto SubscriptionType através da chamada do método getSubscriptionType
     * @param id
     * @param dto
     * @return SubscriptionType
     */
    @Override
    public SubscriptionType update(Long id, SubscriptionTypeDto dto) {
        getSubscriptionType(id);
        dto.setId(id);      // Neste caso o id é passado porque o método getSubscriptionType não retorna o id já que ele não é um atributo do objeto SubscriptionType
        return subscriptionTypeRespository.save(SubscriptionTypeMapper.fromDtoToEntity(dto));
    }


    /**
     * Este método é chamado pelo método delete da classe SubscriptionTypeController
     * que por sua vez é chamado pelo método delete da classe SubscriptionTypeResource
     * Ele remove um objeto SubscriptionType caso o mesmo exista e a existencia é verificada através da chamada do método getSubscriptionType
     * @param id
     */
    @Override
    public void delete(Long id) {
        getSubscriptionType(id);
        subscriptionTypeRespository.delete(getSubscriptionType(id));
    }

    /**
     * Este método é chamado pelo método findById da classe SubscriptionTypeServiceImpl
     * Ele retorna um objeto SubscriptionType através da chamada do método findById do repositório SubscriptionTypeRepository
     * @param id
     * @return
     */
    private SubscriptionType getSubscriptionType(Long id) {
        Optional<SubscriptionType> optionalSubscriptionType = subscriptionTypeRespository.findById(id);
        if (optionalSubscriptionType.isEmpty()) {
            throw new NotFoundException("SubscriptionType Não encontrado");
        }
        return optionalSubscriptionType.get();
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
