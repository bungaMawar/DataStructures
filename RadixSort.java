public class RadixSort {
    private static void radixSort(int[] input, int radix, int width){
        for (int i = 0; i < width; i++){
            radixSingleSort(input, i, radix);
        }
    }

    private static void radixSingleSort(int[] input, int position, int radix){
        int numItems = input.length;

        int[] countArray = new int[radix];

        for(int value: input){
            countArray[getDigit(position, value, radix)]++;
        }

        //adjust count array
        for(int j = 1; j < radix; j++){
            countArray[j] += countArray[j - 1];
        }

        int[] temp = new int[numItems];
        for(int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--){
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }

        for(int tempIndex = 0; tempIndex < numItems; tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }
    }

    private static int getDigit(int position, int value, int radix){
        return value/(int)Math.pow(10, position) % radix;
    }

    public static void main(String args[]){
        int array[] = {1253, 6745, 6313, 5672, 3123};

        radixSort(array, 10, 4);

        System.out.print("array: ");
        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + " ");
        }
        System.out.println(); 
    }
}
