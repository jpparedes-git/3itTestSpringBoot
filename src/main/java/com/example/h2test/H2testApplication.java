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
	public CommandLineRunner demo(UserRepository userRepository,
		MusicRepository musicRepository
	) {
	  return (args) -> {
		// save a few customers
		userRepository.save(new User("aa@gmail.com"));
		userRepository.save(new User("bb@gmail.com"));

		musicRepository.save(new Music("K'POP"));
		musicRepository.save(new Music("RAP"));
	  };
	}

}
