package challenges.thitydaysofcode;

import interfaces.Challenge;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Day1 implements Challenge {

    @Override
    public void execute() throws IOException {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int intInput = scan.nextInt();
        scan.nextLine();
        double doubleInput = scan.nextDouble();
        scan.nextLine();
        String stringInput = scan.nextLine();

        System.out.println(i + intInput);
        System.out.println(new DecimalFormat("#.0").format(d + doubleInput));
        System.out.println(s + stringInput);
    }
}
