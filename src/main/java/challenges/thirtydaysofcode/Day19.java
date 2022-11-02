package challenges.thirtydaysofcode;

import interfaces.Challenge;

import java.io.IOException;
import java.util.Scanner;

public class Day19 implements Challenge {

    @Override
    public void execute() throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new CalculatorDay19();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}

class CalculatorDay19 implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int divisorSum = 0;
        for (int i = 0; i < n; i++) {
            if (n % (i+1) == 0) divisorSum+=i+1;
        }
        return divisorSum;
    }
}

interface AdvancedArithmetic {

    int divisorSum(int n);
}