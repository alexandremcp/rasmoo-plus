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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subscriptions_type_id")
    private long id;

    private String name;

    @Column(name = "access_months")
    private Long accessMonth;

    private BigDecimal price;

    @Column(name = "product_key", unique = true)
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
 * 
 * O Model é uma classe que representa uma entidade de negócio, ou seja, 
 * um objeto que possui atributos e comportamentos que definem suas características e ações.
 * 
 * O Repository é uma interface que define métodos para interagir com o banco de dados, 
 * como inserir, atualizar, excluir e buscar dados.
 * 
 * O Service contém a lógica de negócio da aplicação. 
 * Ele é responsável por implementar as regras de negócio e coordenar as operações entre o Controller e o Repository. 
 * O Service pode realizar validações de dados, cálculos complexos, chamadas a APIs externas, entre outras tarefas.
 * 
 * O Controller é uma classe que recebe as requisições HTTP do cliente e envia as respostas HTTP de volta. 
 * Ele atua como intermediário entre o cliente e a lógica de negócio da aplicação. 
 * O Controller recebe os parâmetros da requisição, chama os métodos do Service para executar as operações necessárias e 
 * retorna uma resposta HTTP com os dados solicitados ou uma mensagem de erro, se necessário.
 */
