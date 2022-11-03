package challenges.thirtydaysofcode;

import interfaces.Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Day20 implements Challenge {

    @Override
    public void execute() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());

        bufferedReader.close();

        int numberOfSwaps = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <(n - 1); j++) {
                if (a.get(j) > a.get(j + 1)) {
                    int aux = a.get(j);
                    int aux2 = a.get(j + 1);
                    a.remove(j);
                    a.add(j, aux2);
                    a.remove(j + 1);
                    a.add(j + 1, aux);
                    numberOfSwaps++;
                }
            }
            if (numberOfSwaps == 0) {
                break;
            }
        }

        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(n-1));

    }
}
