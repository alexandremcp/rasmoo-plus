package com.client.ws.rasmooplus.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "user_type")
public class UserType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_type_id")
    private long id;

    private String name;

    private String description;

    public UserType(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    public UserType() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }    
    
}

/*
 *  A opção Serializable na classe Java indica que seus objetos podem ser serializados, ou seja,
 *  podem ser convertidos em uma sequência de bytes para serem armazenados em um arquivo,
 *  transmitidos através de uma rede ou mantidos em memória para uso posterior.
 */
