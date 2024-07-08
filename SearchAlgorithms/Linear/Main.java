package SearchAlgorithms.Linear;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 45, 12, 34, 63, 5, 13};

        System.out.println(linearSearch(array, 34));
        System.out.println(linearSearch(array, 10));
        System.out.println(linearSearch(array, 5));
    }

    public static int linearSearch(int[] input, int value){
        for(int i = 0; i < input.length; i++){
            if(input[i] == value){
                return i;
            }
        }
        return -1;
    }
}
