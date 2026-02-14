package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.entities.Profile;
import com.example.demo.repositories.UserRepository;
import com.example.demo.repositories.ProfileRepository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
@Transactional
public class UserService {
  private final UserRepository repository;
  private final EntityManager entityManager;
  private final ProfileRepository profileRepository;
  public void showEntityState(){
    User user = User.builder()
      .name("tt")
      .email("tt")
      .password("tt")
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
  @Transactional
  public void showRolatedEntities(){
    // User user = repository.findById(2L).orElseThrow();
    Profile profile = profileRepository.findById(2L).orElseThrow();
    System.out.println(profile.getBio());
    System.out.println(profile.getUser().getEmail());
  }
}
