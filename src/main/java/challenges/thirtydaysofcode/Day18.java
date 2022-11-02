package challenges.thirtydaysofcode;

import interfaces.Challenge;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Day18 implements Challenge {

    @Override
    public void execute() throws IOException {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        SolutionDay18 p = new SolutionDay18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}

class SolutionDay18 {
    LinkedList<Character> queue = new LinkedList<>();
    LinkedList<Character> stack = new LinkedList<>();

    public void enqueueCharacter(char c) {
        queue.addLast(c);
    }

    public Character dequeueCharacter() {
        return queue.remove(0);
    }

    public void pushCharacter(char c) {
        stack.addFirst(c);
    }

    public Character popCharacter() {
        return stack.remove(0);
    }




}