package challenges.thitydaysofcode;

import interfaces.Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day8 implements Challenge {


    @Override
    public void execute() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        // The first line contains an integer, , denoting the number of entries in the phone book.
        int numberOfEntries = Integer.parseInt(in.readLine());

        // Each of the  subsequent lines describes an entry in the form of  space-separated values on a single line. The first value is a friend's name, and the second value is an -digit phone number.
        Map<String, Integer> phoneBook = new HashMap<>();
        for (int i = 0; i < numberOfEntries; i++) {
            String[] entries = in.readLine().split(" ");
            phoneBook.put(entries[0], Integer.parseInt(entries[1]));
        }

        // After the  lines of phone book entries, there are an unknown number of lines of queries. Each line (query) contains a  to look up, and you must continue reading lines until there is no more input.
        String keyToQuery;
        List<String> queryKeysList = new ArrayList<String>();
        while ((keyToQuery = in.readLine()) != null && !keyToQuery.isEmpty()) {
            queryKeysList.add(keyToQuery);
        }

        for (String key : queryKeysList) {
            Integer phoneNumber = phoneBook.get(key);
            if (phoneNumber != null) {
                System.out.println(key + "=" + phoneNumber);
            } else {
                System.out.println("Not found");
            }
        }

        in.close();
    }
}
