package challenges.thitydaysofcode;

import interfaces.Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day3 implements Challenge {


    @Override
    public void execute() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if (n > 5 && n < 21) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
        bufferedReader.close();
    }
}
