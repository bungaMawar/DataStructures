public class Factorials {
    private static int factorialRecursive(int x){
        if(x == 0){
            return 1;
        } else{
            return x * factorialRecursive(x - 1);
        }
    }

    private static int factorialIterative(int x){
        int factorial = 1;
        while(x > 1){
            System.out.print(factorial + " ");
            factorial = factorial * x;
            x--;
        }
        System.out.println();
        return factorial;
    }

    public static void main(String args[]){
        System.out.println("recursive: " + factorialRecursive(Integer.parseInt(args[0])));
        System.out.println("iterative: " + factorialIterative(Integer.parseInt(args[0])));
    }   
}
