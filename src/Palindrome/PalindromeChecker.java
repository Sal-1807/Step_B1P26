package Palindrome;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        scanner.close();
    }
}