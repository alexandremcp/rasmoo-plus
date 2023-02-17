package com.client.ws.rasmooplus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client.ws.rasmooplus.model.SubscriptionType;
import com.client.ws.rasmooplus.repository.SubscriptionTypeRepository;

@RestController
@RequestMapping("/subscription-type")
public class SubscriptionTypeController {

    @Autowired
    private SubscriptionTypeRepository subscriptionTypeRepository;

    @GetMapping()
    public ResponseEntity<List<SubscriptionType>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeRepository.findAll());
    }
}

/*
 * Esté é um controlador REST que lida com solicitações relacionadas aos tipos de assinatura em um sistema.
 * Essa classe usa a anotação @RestController para indicar que seus métodos retornam respostas HTTP para solicitações REST.
 * 
 * subscriptionTypeRepository é uma variável do tipo SubscriptionTypeRepository.
 * Essa variável é anotada com a anotação @Autowired, o que significa que o Spring Framework será responsável por injetar
 * uma instância de SubscriptionTypeRepository nessa variável quando a classe for instanciada.
 * 
 * Em seguida, a classe SubscriptionTypeController define o método findAll(), que retorna uma lista de todos os tipos de
 * assinatura existentes no sistema. Esse método usa a variável subscriptionTypeRepository para chamar o método findAll()
 * na interface SubscriptionTypeRepository, que é fornecido pelo Spring Data JPA para acessar os dados dos tipos de
 * assinatura no banco de dados.
 * 
 * Finalmente, a classe SubscriptionTypeController envolve a lista de tipos de assinatura em uma resposta HTTP com o status 200 OK
 * usando a classe ResponseEntity. Essa classe é usada para construir uma resposta personalizada com um corpo e um status HTTP específico.
 * Nesse caso, o corpo da resposta é a lista de tipos de assinatura e o status HTTP é 200 OK, indicando que a solicitação foi bem-sucedida.
 */