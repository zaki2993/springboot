package com.example.demo;

import com.example.demo.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.UserService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
  var rep = context.getBean(UserRepository.class);
  // rep.findAll().forEach(u -> System.out.println(u.getEmail()));
  rep.deleteById(1L);
	}

}
