package Palindrome;

import java.util.Scanner;

public class PalindromeChecker {

    public static boolean iterative(String str){

        int left = 0;
        int right = str.length()-1;

        while(left < right){

            if(str.charAt(left) != str.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static boolean recursive(String str,int left,int right){

        if(left >= right) return true;

        if(str.charAt(left) != str.charAt(right))
            return false;

        return recursive(str,left+1,right-1);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String input = sc.nextLine();

        long start1 = System.nanoTime();
        iterative(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        recursive(input,0,input.length()-1);
        long end2 = System.nanoTime();

        System.out.println("Iterative Time: " + (end1-start1));
        System.out.println("Recursive Time: " + (end2-start2));
    }
}