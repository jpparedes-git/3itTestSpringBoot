package com.example.h2test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicService {
    
    @Autowired
    private MusicRepository musicRepository;

    public void insertMusic(Music music){
        musicRepository.save(music);
    }

    public List<Music> getAllMusics(){
        return musicRepository.findAll();
    }

    public Music getMusicById(int id){
        return musicRepository.findById(id);
    }

}
