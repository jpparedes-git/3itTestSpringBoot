package com.example.h2test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2testApplication {

	private static final Logger log = LoggerFactory.getLogger(H2testApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(H2testApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(MusicService musicService
	) {
	  return (args) -> {
		/*
		User aa = new User("aa@gmail.com");
		ResponseForm responseForm = new ResponseForm(aa);
		aa.setResponse(responseForm);
		userRepository.save(aa);
		responseForm.setUserId(aa.getId());
		responseFormRepository.save(responseForm);
		 */

		Music musicKpop = new Music("K-POP");
		musicService.insertMusic(musicKpop);
		Music musicRap = new Music("RAP");
		musicService.insertMusic(musicRap);
		Music musicRock = new Music("ROCK");
		musicService.insertMusic(musicRock);
		Music musicJazz = new Music("JAZZ");
		musicService.insertMusic(musicJazz);
	  };
	}

}
