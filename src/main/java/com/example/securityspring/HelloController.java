package com.example.securityspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
  
  @GetMapping("/hello")
  public String hello(){
    return "Hello World";
  }
  
  @GetMapping("/public/hello")
  public String publicHello(){
    return "Hello World whitout authentication";
  }
  
  @GetMapping("/public/names")
  public List<String> publicNames(){
    return List.of("Felipe", "Daniela", "Maria", "Carlos", "Diego");
  }
  
}
