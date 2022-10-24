package challenges.thirtydaysofcode;

import interfaces.Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day10 implements Challenge {
    @Override
    public void execute() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int majorConsecutive1Counter = 0;
        int consecutive1Counter = 0;
        for (; n > 0; n = n / 2) {
            int binaryBase = n % 2;
            if (binaryBase == 1) {
                consecutive1Counter++;
                if (consecutive1Counter > majorConsecutive1Counter) {
                    majorConsecutive1Counter = consecutive1Counter;
                }
            } else {
                consecutive1Counter = 0;
            }

        }
        System.out.println(majorConsecutive1Counter);

        bufferedReader.close();
    }
}
