package com.example.h2test;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Music {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy="music")
    private Set<ResponseForm> responses;

    public Music(){

    }

    public Music(String musicName){
        name = musicName;
    }

    @Override
    public String toString() {
      return String.format(
          "Music[id=%d, name='%s']",
          id, name);
    }
  
    public Long getId() {
      return id;
    }
  
    public String getName() {
      return name;
    }
}
