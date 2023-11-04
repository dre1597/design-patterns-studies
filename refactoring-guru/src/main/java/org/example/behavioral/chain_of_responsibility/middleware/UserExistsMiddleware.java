package org.example.behavioral.chain_of_responsibility.middleware;

import org.example.behavioral.chain_of_responsibility.server.Server;

public class UserExistsMiddleware extends Middleware {
  private Server server;

  public UserExistsMiddleware(Server server) {
    this.server = server;
  }

  @Override
  public boolean check(String email, String password) {
    if (!server.hasEmail(email)) {
      System.out.println("User does not exist!");
      return false;
    }
    if (!server.isValidPassword(email, password)) {
      System.out.println("Invalid password!");
      return false;
    }
    return checkNext(email, password);
  }
}
