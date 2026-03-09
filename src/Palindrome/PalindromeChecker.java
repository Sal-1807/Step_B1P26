package Palindrome;

import java.util.Scanner;

interface PalindromeStrategy{
    boolean check(String str);
}

class IterativeStrategy implements PalindromeStrategy{

    public boolean check(String str){

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

class RecursiveStrategy implements PalindromeStrategy{

    public boolean check(String str){
        return checkRec(str,0,str.length()-1);
    }

    private boolean checkRec(String str,int left,int right){

        if(left >= right) return true;

        if(str.charAt(left) != str.charAt(right))
            return false;

        return checkRec(str,left+1,right-1);
    }
}

public class PalindromeChecker {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String input = sc.nextLine();

        PalindromeStrategy strategy = new IterativeStrategy();

        if(strategy.check(input)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}