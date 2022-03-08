package com.cams.ump;

import com.cams.ump.User;
import com.cams.ump.UserRepository;
import java.util.stream.Stream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository userRepository) {
		return args -> {
			User user = new User("Marty", "Johnson", "marty_johnson@email.com");
			userRepository.save(user);
				 user = new User("Diane", "Smith", "diaSmith@email.com");
			userRepository.save(user);
			//userRepository.delete(user);
				 user = new User("Michael", "Caine", "micCaine@email.com");
			userRepository.save(user);
				 user = new User("Woolie", "Kissel", "woolzkss@email.com");
			userRepository.save(user);

			userRepository.findAll().forEach(System.out::println);

		};
	}
}
