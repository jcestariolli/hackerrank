package challenges.thirtydaysofcode;

import interfaces.Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day16 implements Challenge {

    @Override
    public void execute() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();

        bufferedReader.close();
        try {
            System.out.println(Integer.parseInt(S));
        } catch (NumberFormatException w) {
            System.out.println("Bad String");
        }
    }
}
