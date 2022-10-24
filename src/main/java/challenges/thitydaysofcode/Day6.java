package challenges.thitydaysofcode;

import interfaces.Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Day6 implements Challenge {


    private static void printOrderedString(String s) {
        String outputEven = "", outputOdd = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                outputEven += s.charAt(i);
            } else {
                outputOdd += s.charAt(i);
            }
        }
        System.out.println(outputEven + " " + outputOdd);
    }

    @Override
    public void execute() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int qttWords = Integer.parseInt(bufferedReader.readLine().trim());
        ArrayList<String> wordsList = new ArrayList<>();
        for (int i = 0; i < qttWords; i++) {
            wordsList.add(bufferedReader.readLine().trim());
        }
        for (int i = 0; i < wordsList.size(); i++) {
            printOrderedString(wordsList.get(i));
        }
        bufferedReader.close();
    }
}
