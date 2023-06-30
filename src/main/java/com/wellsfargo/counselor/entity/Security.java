package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToMany
    @JoinColumn(name = "PortfolioId")
    private Portfolio Portfolio;

    @Column(nullable = false)
    private String securityName;

    @Column(nullable = false)
    private Long securityPrice;

    @Column(nullable = false)
    private Long securityQuantity;

   
    protected Advisor() {

    }

    public Advisor(String securityName, String securityPrice, String securityQuantity) {
        this.securityName = securityName;
        this.securityPrice = securityPrice;
        this.securityQuantity =securityQuantity;
    }

    public Long getAdvisorId() {
        return securiyId;
    }

    public String securityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

   public String securityPrice() {
        return securityPrice;
    }

    public void setSecurityName(String securityPrice) {
        this.securityPrice = securityPrice;
    }

   public String securityQuantity() {
        return securityQuantity;
    }

    public void setSecurityQuantity(String securityQuantity) {
        this.securityQuantity = securityQuantity;
    }
    
}
