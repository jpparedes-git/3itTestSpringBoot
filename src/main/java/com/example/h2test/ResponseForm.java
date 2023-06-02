package com.example.h2test;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
@Entity
@Table(name = "responseform")
public class ResponseForm {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "response")
	private User user;
    @ManyToOne
    @JoinColumn(name="music_id", nullable=false)
    private Music music;

    public ResponseForm(){

    }

    public ResponseForm(User _user, Music _music){
        this.user = _user;
        this.music = _music;
    }

    @Override
    public String toString() {
      return String.format(
          "ResponseForm[id=%d]",
          id);
    }

    public User getUser(){
        return user;
    }

    public Music getMusic(){
        return music;
    }
}
