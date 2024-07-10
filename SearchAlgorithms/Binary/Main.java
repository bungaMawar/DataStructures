package SearchAlgorithms.Binary;

public class Main {
    public static void main(String[] args) {
        int[] array = {-22, -15, 1, 7, 20, 35, 55};

        System.out.println(iterative(array, 1));
        System.out.println(iterative(array, 29));
        System.out.println(iterative(array, 20));

        System.out.println("--------------------");

        System.out.println(recursive(array, 3));
        System.out.println(recursive(array, 35));
        System.out.println(recursive(array, 7));
        
    }

    public static int iterative(int[] input, int value){
        int start = 0; 
        int end = input.length;
    

        while(start < end){
            int midpoint = (start + end)/2;
            System.out.println("midpoint = " + midpoint);
            if(input[midpoint] == value){
                return midpoint;
            } else if(input[midpoint] < value){
                start = midpoint + 1;
            } else{
                end = midpoint;
            }
        }
        return - 1;
    }

    public static int recursive(int[] input, int value){
        return recursive(input, 0, input.length, value);
    }

    public static int recursive(int[]input, int start, int end, int value){
        if(start >= end){
            return -1;
        }

        int midpoint = (start + end)/2;

        if(input[midpoint] == value){
            return midpoint;
        } else if(input[midpoint] < value){
            return recursive(input, midpoint + 1, end, value);
        } else{
            return recursive(input, start, midpoint, value);
        }
    }
}
