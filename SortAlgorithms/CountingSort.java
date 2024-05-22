public class CountingSort {
    private static void countingSort(int [] input, int min, int max){
        int[] countArray = new int[(max - min) + 1];

        for(int i = 0; i < input.length; i++){
            countArray[input[i] - min]++;
        }

        int j = 0; 
        for(int i =  min; i <= max; i++){
            while(countArray[i - min] > 0){
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }
    public static void main(String args[]){
        int array[] = {1, 2, 10, 1, 4, 5, 4, 7, 4, 9};
        countingSort(array, 1, 10);
        System.out.print("array: ");
        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + " ");
        }
        System.out.println(); 
    }
}
