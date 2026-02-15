package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.entities.Address;
import com.example.demo.entities.Profile;
import com.example.demo.repositories.UserRepository;
import com.example.demo.repositories.AddressRepository;
import com.example.demo.repositories.ProfileRepository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
// @Transactional
public class UserService {
  private final UserRepository userRepository;
  private final EntityManager entityManager;
  private final AddressRepository addressRepository;
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
  userRepository.save(user);
  if (entityManager.contains(user)) {
      System.out.println("is presiste");
    }
    else{
      System.out.println("not prosiste");
    }
  }
  // @Transactional
  // public void showRolatedEntities(){
    // Profile profile = profileRepository.findById(2L).orElseThrow();
    // System.out.println(profile.getUser().getEmail());
  // }
  // @Transactional
  public void showAddress(){
    Address address = addressRepository.findById(1L).orElseThrow();
    System.out.println(address.getState());
  }
}
