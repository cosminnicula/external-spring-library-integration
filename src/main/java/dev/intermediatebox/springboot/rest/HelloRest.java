package dev.intermediatebox.springboot.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.openlib.springcore.service.HelloService;

@RestController
@RequestMapping(path = "api")
public class HelloRest {
  @Autowired
  HelloService helloService;

  @GetMapping("hello")
  public ResponseEntity<String> sayHello() {
    return ResponseEntity.ok().body(helloService.getMessage("Spring application"));
  }
}
