package Stacks.Palindromes;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
    // should return true
    System.out.println(checkForPalindrome("abccba"));
    // should return true
    System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
    // should return true
    System.out.println(checkForPalindrome("I did, did I?"));
    // should return false
    System.out.println(checkForPalindrome("hello"));
    // should return true
    System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        LinkedList<Character> palindrome = new LinkedList<Character>();
        int x = 0;

        for(int i = 0; i < string.length(); i++){
            if(Character.isLetter(string.charAt(i))){
                palindrome.push(Character.toLowerCase(string.charAt(i)));
            }
        }

        char[] firsthalf = new char[palindrome.size()];
        System.out.println("size: " + palindrome.size()/2);
        for(x = 0; x <= palindrome.size()/2; x++){

            firsthalf[x] = palindrome.pop();
        }
        System.out.println(palindrome);
        System.out.println(firsthalf);

        x--;
        while(x >= 0){
            System.out.println(palindrome.peek() + " - " + firsthalf[x]);
            if(palindrome.pop() != firsthalf[x]){
                return false;
            }
            x--;
        }
        return true;
    }
}
