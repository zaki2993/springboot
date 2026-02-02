package com.example.demo;

import com.example.demo.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.example.demo.repositories.UserRepository;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
  var repository = context.getBean(UserRepository.class);
	var user = User.builder()
			.name("zaka")
			.email("email")
			.password("password")
			.build();
	repository.save(user);
	}

}
