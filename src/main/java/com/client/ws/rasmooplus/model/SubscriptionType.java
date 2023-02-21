package com.client.ws.rasmooplus.model;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Table(name = "subscriptions_type")
@Entity
public class SubscriptionType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subscriptions_type_id")
    private long id;

    private String name;

    @Column(name = "access_months")
    private Long accessMonth;

    private BigDecimal price;

    @Column(name = "product_key")
    private String productKey;       
}

/*
 * @GeneratedValue(strategy = GenerationType.AUTO)
 * ***********************************************
 * O comando @GeneratedValue(strategy = GenerationType.AUTO) é uma anotação que é usada para especificar como o valor da chave primária
 * de uma entidade deve ser gerado pelo JPA (Java Persistence API).
 * 
 * Neste caso, a estratégia escolhida é GenerationType.AUTO, o que significa que o provedor JPA selecionará a estratégia mais apropriada
 * com base no banco de dados subjacente. A estratégia escolhida pode ser SEQUENCE, IDENTITY, TABLE, AUTO, ou outra dependendo do provedor
 * de banco de dados utilizado.
 * 
 * A anotação @GeneratedValue é usada em conjunto com a anotação @Id, que é usada para especificar que um atributo de uma entidade representa
 * a chave primária dessa entidade. Neste caso, o atributo id é a chave primária da entidade SubscriptionType e a anotação @Id é usada para
 * marcar esse atributo como tal. Com a adição da anotação @GeneratedValue, a geração do valor da chave primária será gerenciada automaticamente pelo JPA.
 * 
 * 
 * SubscriptionType
 * ****************
 * Representa o modelo de dados do usuário, contendo os atributos e métodos necessários para manipulá-los.
 * 
 * A ordem de criação sugerida seria:
 *      SubscriptionType.java - Model
 *      SubscriptionTypeRepository.java - Repository
 *      SubscriptionTypeService.java - Service
 *      SubscriptionTypeServiceImpl.java - Service
 *      SubscriptionTypeController.java - Controller
 * No entanto, a ordem exata pode variar dependendo da abordagem adotada pelo desenvolvedor.
 * É importante lembrar que as classes do modelo e do repositório são geralmente criadas primeiro,
 * seguidas pelas classes de serviço e, por fim, pelo controlador.
 */
