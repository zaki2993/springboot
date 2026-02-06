package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UsersController {

  private final UserRepository userRepository;

  @GetMapping
  public Iterable<User> getUsers(){
    return  userRepository.findAll();
  }
  @GetMapping("{id}")
  public User getUser(@PathVariable Long id){
    return userRepository.findById(id).orElse(null);
  }
}
