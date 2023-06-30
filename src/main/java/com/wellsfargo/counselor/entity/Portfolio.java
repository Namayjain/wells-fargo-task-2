package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long PortfolioId;

    @ManyToMany
    @JoinColumn(name = "clientId")
    private Client Client;
    protected Client() {

    }

    public Advisor() {
      
    }

    public Long getPortfolioId() {
        return advisorId;
    }

    public String getClientId() {
        return clientId;
    }

     public void setClientId(List ClientId) {
      this.clientId = clientId;
   }

   }
