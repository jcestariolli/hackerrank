package challenges.java;

import interfaces.Challenge;

import java.io.IOException;

public class WelcomeToJava implements Challenge {

    @Override
    public void execute() throws IOException {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }
}
