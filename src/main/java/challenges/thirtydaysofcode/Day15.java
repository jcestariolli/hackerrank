package challenges.thirtydaysofcode;

import interfaces.Challenge;

import java.io.IOException;
import java.util.Scanner;

public class Day15 implements Challenge {

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static Node insert(Node head, int data) {
        Node newTailNode = new Node(data);
        if (head == null) return newTailNode;
        Node tempHead = head;
        while (tempHead.next != null) tempHead = tempHead.next;
        tempHead.next = newTailNode;
        return head;
    }

    @Override
    public void execute() throws IOException {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}