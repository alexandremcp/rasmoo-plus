package com.client.ws.rasmooplus.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

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

    @ManyToOne
    @JoinColumn(name = "subscription_type_id")
    private SubscriptionType subscriptionType;

    public User() {
    }

    public User(String name, String email, String phone, String cpf, LocalDate dtSubscription,
            LocalDate dtExpiration, UserType userType, SubscriptionType subscriptionType) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.cpf = cpf;
        this.dtSubscription = dtSubscription;
        this.dtExpiration = dtExpiration;
        this.userType = userType;
        this.subscriptionType = subscriptionType;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDtSubscription() {
        return dtSubscription;
    }

    public void setDtSubscription(LocalDate dtSubscription) {
        this.dtSubscription = dtSubscription;
    }

    public LocalDate getDtExpiration() {
        return dtExpiration;
    }

    public void setDtExpiration(LocalDate dtExpiration) {
        this.dtExpiration = dtExpiration;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public SubscriptionType getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(SubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType;
    }
    
}
