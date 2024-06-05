package Queues.Palindrome;

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
        String noPunctuation = new String();
        for(int i = 0; i < string.length(); i++){
            if(Character.isLetter(string.charAt(i))){
                noPunctuation = noPunctuation + Character.toLowerCase(string.charAt(i));
            }
        }
        String comp = noPunctuation;
        System.out.println(comp);
        int count = 0;
        for(int i = noPunctuation.length() - 1; i > 0; i--){
            if(noPunctuation.charAt(i) != comp.charAt(count)){
                return false;
            }
            count++;
        }
        return true;
    }
}
