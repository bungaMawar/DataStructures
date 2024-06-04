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
        LinkedList<Character> stack = new LinkedList<Character>();
        StringBuilder nopunctuation = new StringBuilder(string.length());
        String lowercase = string.toLowerCase();

        for(int i = 0; i < lowercase.length(); i++){
            char c = lowercase.charAt(i);
            if(c >= 'a' && c <= 'z'){
                nopunctuation.append(c);
                stack.push(c);
            }
        }

        StringBuilder reversed = new StringBuilder(stack.size());
        while(!stack.isEmpty()){
            reversed.append(stack.pop());
        }

        return reversed.toString().equals(nopunctuation.toString());
    }
}
