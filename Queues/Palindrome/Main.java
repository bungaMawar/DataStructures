package Queues.Palindrome;

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

    private static boolean checkForPalindrome(String string){
        LinkedList<Character> stack = new LinkedList<Character>();
        LinkedList<Character> queue = new LinkedList<Character>();
        String lowercase = string.toLowerCase();

        for (int i = 0; i < lowercase.length(); i++){
            char c = lowercase.charAt(i);
            if(Character.isLetter(c)){
                queue.addLast(c);
                stack.push(c);
            }
        }
        
        while(!stack.isEmpty()){
            if(!stack.pop().equals(queue.removeFirst())){
                return false;
            }
        }

        return true;
    }
}
