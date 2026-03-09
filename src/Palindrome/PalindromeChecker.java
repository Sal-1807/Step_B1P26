package Palindrome;

import java.util.Scanner;

class PalindromeService{

    public boolean checkPalindrome(String str){

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
}

public class PalindromeChecker {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        PalindromeService service = new PalindromeService();

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        if(service.checkPalindrome(input)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}