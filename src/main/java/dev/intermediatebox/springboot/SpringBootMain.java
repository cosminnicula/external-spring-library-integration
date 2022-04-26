package dev.intermediatebox.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"dev.intermediatebox", "xyz.openlib.springcore"})
public class SpringBootMain {
  public static void main(String[] args) {
    SpringApplication.run(SpringBootMain.class, args);
  }
}
