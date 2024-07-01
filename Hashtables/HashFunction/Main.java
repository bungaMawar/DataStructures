package Hashtables.HashFunction;

public class Main {
    public static void main(String args[]){
        int[] nums = new int[10];
        int[] addNums = {59382, 43, 6894, 500, 99, -58};

        for(int i = 0; i < addNums.length; i++){
            nums[hash(addNums[i])] = addNums[i];
        }

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static int hash(int value){
        return Math.abs(value % 10);
    }
}
