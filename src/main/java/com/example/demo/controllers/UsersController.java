package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
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
  public ResponseEntity<User> getUser(@PathVariable Long id){
    var status = userRepository.findById(id).orElse(null);
    if(status == null){
      return ResponseEntity.notFound().build();
    }
    else{
      return ResponseEntity.ok(status);
    }
  }
}
