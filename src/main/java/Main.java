import challenges.thirtydaysofcode.*;
import interfaces.Challenge;

import java.io.IOException;

public class Main {
    public static void main(String[] argh) throws IOException {

        // TODO instantiate the challenge to execute it here
        Challenge challengeToExecute = new Day20();

        challengeToExecute.execute();
    }
}
