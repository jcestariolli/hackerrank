package challenges.thirtydaysofcode;

import interfaces.Challenge;

import java.io.IOException;
import java.util.Scanner;

public class Day12 implements Challenge {
    @Override
    public void execute() throws IOException {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());


    }
}

class Person {
    protected String firstName;
    protected String lastName;
    protected int id;

    public Person(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }


    public void printPerson() {
        System.out.println("Name: " + this.lastName + ", " + this.firstName);
        System.out.println("ID: " + this.id);
    }
}

class Student extends Person {
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    public Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);

        this.testScores = testScores;
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    public char calculate() {
        int scoresSum = 0;
        for (int i = 0; i < this.testScores.length; i++) {
            scoresSum += testScores[i];
        }
        double average = (scoresSum / testScores.length);
        if (average < 40) return 'T';
        if (average < 55) return 'D';
        if (average < 70) return 'P';
        if (average < 80) return 'A';
        if (average < 90) return 'E';
        return 'O';
    }
}