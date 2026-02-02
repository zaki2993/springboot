package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
@Transactional
public class UserService {
  private final UserRepository repository;
  private final EntityManager entityManager;
  public void showEntityState(){
    User user = User.builder()
      .name("test")
      .email("test")
      .password("test")
      .build();
    if (entityManager.contains(user)) {
      System.out.println("is presiste");
    }
    else{
      System.out.println("not prosiste");
    }
  repository.save(user);
  if (entityManager.contains(user)) {
      System.out.println("is presiste");
    }
    else{
      System.out.println("not prosiste");
    }
  }
}
