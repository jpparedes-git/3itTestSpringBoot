package com.example.h2test;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(unique=true)
    private String email;

    public User(){}
    
    public User(String _email){
        this.email = _email;
    }

    @Override
    public String toString() {
      return String.format(
          "User[id=%d,email='%s']",
          id, email);
    }
  
    public Long getId() {
      return id;
    }
  
    public String getEmail(){
      return email;
    }
}
