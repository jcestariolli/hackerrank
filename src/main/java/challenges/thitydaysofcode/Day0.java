package challenges.thitydaysofcode;

import interfaces.Challenge;

import java.io.IOException;

public class Day0 implements Challenge {

    @Override
    public void execute() throws IOException {
        String inputString = new Scanner(System.in).nextLine();
        System.out.println("Hello, World.");
        System.out.println(inputString);
    }
}
