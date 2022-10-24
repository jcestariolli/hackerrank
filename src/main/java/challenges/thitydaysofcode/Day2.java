package challenges.thitydaysofcode;

import interfaces.Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day2 implements Challenge {


    @Override
    public void execute() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        ResultDay2.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}

class ResultDay2 {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tipCost = meal_cost * (double) tip_percent / 100;
        double taxCost = meal_cost * (double) tax_percent / 100;
        System.out.println((int) Math.round(meal_cost + tipCost + taxCost));
    }

}
