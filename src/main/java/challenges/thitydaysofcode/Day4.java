package challenges.thitydaysofcode;

import interfaces.Challenge;

import java.io.IOException;
import java.util.Scanner;

public class Day4 implements Challenge {


    @Override
    public void execute() throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            PersonDay4 p = new PersonDay4(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}

class PersonDay4 {
    private int age;

    public PersonDay4(int initialAge) {
        if (initialAge < 0) {
            initialAge = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        this.age = initialAge;
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        String message;
        if (this.age < 13) {
            message = "You are young.";
        } else if (this.age < 18) {
            message = "You are a teenager.";
        } else {
            message = "You are old.";
        }
        System.out.println(message);
    }

    public void yearPasses() {
        this.age++;
    }
}
