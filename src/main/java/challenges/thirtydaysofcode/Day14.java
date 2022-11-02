package challenges.thirtydaysofcode;

import interfaces.Challenge;

import java.io.IOException;
import java.util.Scanner;

public class Day14 implements Challenge {

    @Override
    public void execute() throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

class Difference {

    public int maximumDifference;
    private final int[] elements;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        int minimumValue = 100;
        int maximumValue = 1;
        for (int value : this.elements) {
            if (value > maximumValue) maximumValue = value;
            if (value < minimumValue) minimumValue = value;
        }
        this.maximumDifference = maximumValue - minimumValue;
    }
}
