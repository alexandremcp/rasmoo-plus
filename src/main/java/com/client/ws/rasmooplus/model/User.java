package com.client.ws.rasmooplus.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import lombok.*;
import jakarta.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private long id;

    private String name;

    private String email;

    private String phone;

    private String cpf;

    @Column(name = "dt_subscription")
    private LocalDate dtSubscription = LocalDate.now();

    @Column(name = "dt_expiration")
    private LocalDate dtExpiration;

    @ManyToOne
    @JoinColumn(name = "user_type_id")
    private UserType userType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subscription_type_id")
    private SubscriptionType subscriptionType;
}

/*
 * fetch = FetchType.LAZY
 * **********************
 * O comando fetch = FetchType.LAZY na anotação @ManyToOne é usado para especificar que a entidade associada deve ser carregada
 * apenas quando necessário, ou seja, somente quando a propriedade correspondente for acessada pela primeira vez.
 * 
 * No caso específico da classe User, a propriedade subscriptionType é uma entidade associada que representa o tipo de assinatura
 * de um usuário. Quando um objeto User é carregado da base de dados, o JPA não carrega automaticamente o objeto SubscriptionType
 * correspondente. Em vez disso, o JPA carrega apenas os atributos simples (como name, email, phone, etc) do objeto User e adia a
 * busca pelos objetos associados até que sejam necessários.
 * 
 * Essa abordagem é útil para reduzir o tempo de carregamento do objeto User e minimizar o uso de recursos de rede e de memória,
 * especialmente quando existem muitos objetos User na base de dados. No entanto, é importante lembrar que o acesso tardio aos objetos
 * associados pode resultar em múltiplas consultas à base de dados, caso não sejam utilizadas técnicas de otimização para evitar
 * a chamada repetida de consultas.
 */
