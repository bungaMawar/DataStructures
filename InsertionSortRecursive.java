public class InsertionSortRecursive {
    private static void insertionSort(int[] input, int numItems){
        if(numItems < 2){
            return;
        }

        insertionSort(input, numItems - 1);

        int newElement = input[numItems - 1];

        int i;

        for(i = numItems - 1; i > 0 && input[i - 1] > newElement; i--){
            input[i] = input[i - 1];
        }
        input[i] = newElement;

    }

    public static void main(String args[]){
        int array[] = {20, 35, -15, 7, 55, 1, -22};
        insertionSort(array, array.length);

        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + " ");
        }
        System.out.println();
    }
}
