package com.client.ws.rasmooplus.model;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;

@Table(name = "subscription_type")
@Entity
public class SubscriptionType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subscription_type_id")
    private long id;

    private String name;

    @Column(name = "access_month")
    private Long accessMonth;

    private BigDecimal price;

    @Column(name = "product_key")
    private String productKey; 

    public SubscriptionType() {
    }

    public SubscriptionType(String name, Long accessMonth, BigDecimal price, String productKey) {
        this.name = name;
        this.accessMonth = accessMonth;
        this.price = price;
        this.productKey = productKey;
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

    public Long getAccessMonth() {
        return accessMonth;
    }

    public void setAccessMonth(Long accessMonth) {
        this.accessMonth = accessMonth;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProductKey() {
        return productKey;
    }

    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }
    
}
