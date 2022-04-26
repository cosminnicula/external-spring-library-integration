package dev.intermediatebox.nonspring;

import dev.intermediatebox.nonspring.application.HelloApplication;
import xyz.openlib.plainspringproxy.OpenlibContextProvider;

public class ConsoleMain {
  public static void main(String[] args) {
    OpenlibContextProvider contextProvider = new OpenlibContextProvider();
    contextProvider.init();

    HelloApplication application = new HelloApplication();
    application.start();
  }
}
