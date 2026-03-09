package Palindrome;

import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindrome(String str) {

        LinkedList<Character> list = new LinkedList<>();

        for(char c : str.toCharArray()){
            list.add(c);
        }

        while(list.size() > 1){
            if(list.removeFirst() != list.removeLast()){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        if(isPalindrome(input)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}