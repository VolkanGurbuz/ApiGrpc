package test;

import io.grpc.*;
import services.GreetingServiceImpl;

import java.io.File;

public class App {

  public static void main(String[] args) throws Exception {
    // Create a new server to listen on port 8080
    Server server = ServerBuilder.forPort(8082).addService(new GreetingServiceImpl()).build();

    // Start the server
    server.start();

    // Server threads are running in the background.
    System.out.println("Server started");
    // Don't exit the main thread. Wait until server is terminated.
    server.awaitTermination();
    var f = new File("");

    var c = System.console(); // 1
    char[] line = c.readPassword("Please enter your pwd:"); // 2
  }
}
