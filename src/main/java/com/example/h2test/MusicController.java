package com.example.h2test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class MusicController {

    @Autowired
    private MusicService musicService;

    @GetMapping("/musics")
	public List<Music> allMusic(){
		return musicService.getAllMusics();
	}

    @GetMapping("/musics/{id}")
    public Music getMusic(@PathVariable int id){
        return musicService.getMusicById(id);
    }
}
