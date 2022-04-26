package dev.intermediatebox.nonspring.application;

import xyz.openlib.springcore.service.HelloService;
import xyz.openlib.plainspringproxy.service.HelloServiceProxy;

public class HelloApplication {

  public void start() {
    HelloService helloService = HelloServiceProxy.getBean();
    System.out.println(helloService.getMessage("Console application"));
  }
}
