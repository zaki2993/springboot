package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Message;

@RestController
public class MessageController {
  @RequestMapping("/message")
  public Message message(){
    return new Message("zaki",23,"morocco");
  }
}
