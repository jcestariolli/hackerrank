package challenges.thirtydaysofcode;

import interfaces.Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Today, we are building on our knowledge of arrays by
 * adding another dimension. Check out the Tutorial tab
 * for learning materials and an instructional video.
 */
public class Day11 implements Challenge {
    @Override
    public void execute() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        Integer  maxHourglassSum = null;

        for (int i = 1; i < 5; i++) {
            List<Integer> upperLineArray = arr.get(i-1);
            List<Integer> middleLine = arr.get(i);
            List<Integer> lowerLine = arr.get(i+1);
            for (int j = 1; j < 5; j++) {
                int upperLineSum = upperLineArray.get(j-1) + upperLineArray.get(j) +  + upperLineArray.get(j+1);
                int lowerLineSum = lowerLine.get(j-1) + lowerLine.get(j) +  + lowerLine.get(j+1);
                int hourglassSum = upperLineSum + middleLine.get(j) + lowerLineSum;
                if (maxHourglassSum == null) {
                    maxHourglassSum = hourglassSum;
                }
                else if (hourglassSum > maxHourglassSum) {
                    maxHourglassSum = hourglassSum;
                }
            }
        }
        System.out.println(maxHourglassSum);

    }
}
