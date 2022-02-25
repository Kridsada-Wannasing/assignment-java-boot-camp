package com.example.javaspringbootpractice;

import com.example.javaspringbootpractice.users.User;
import com.example.javaspringbootpractice.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JavaSpringBootPracticeApplication {

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void initialUserData() {
		User user = new User();
		user.setName("kridsada");
		userRepository.save(user);
	}

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringBootPracticeApplication.class, args);
	}

}
