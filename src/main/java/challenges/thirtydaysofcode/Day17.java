package challenges.thirtydaysofcode;

import interfaces.Challenge;

import java.io.IOException;
import java.util.Scanner;

public class Day17 implements Challenge {

    @Override
    public void execute() throws IOException {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            CalculatorDay17 myCalculator = new CalculatorDay17();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

class CalculatorDay17 {

    public int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) throw  new Exception("n and p should be non-negative");
        if (p == 0) return 1;
        if (n == 0) return 0;
        int result = n;
        for (int i = 1; i < p ; i++) {
            result*=n;
        }
        return result;
    }
}
