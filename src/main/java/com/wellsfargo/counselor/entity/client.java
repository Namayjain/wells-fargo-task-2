package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class client {

    @Id
    @GeneratedValue()
    private long clientId;
  
    @OneToMany
    @JoinColumn(name = "advisorId")
    private Advisor Advisor;
  
    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String email;

    protected Client() {

    }

    public Client(String Name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public Long getClientId() {
        return clientId;
    }

    public String getAdvisorId() {
        return advisorId;
    }

    public String getName() {
        return name;
    }

    public void setFirstName(String name) {
        this.name = name;
    }    
  
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
