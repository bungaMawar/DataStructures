public class QuickSort {

    private static void quickSort(int[] input, int start, int end){
        if(end - start < 2){
            return;
        }

        int pivot = partition(input, start, end);

        quickSort(input, start, pivot);
        quickSort(input, pivot + 1, end);
    }

    private static int partition(int[] input, int start, int end){
        int pivot = input[start];
        int i = start;
        int j = end;

        while(i < j){
            //empty loop body
            while(i < j && input[--j] >= pivot);
            if(i < j){
                input[i] = input[j];
            }
            //empty loop
            while(i < j && input[++i] <= pivot);
            if(i < j){
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;
    }
    public static void main(String args[]){
        int array[] = {1, 6, 24, -5, 7, 3, 12, 5};
        quickSort(array, 0, array.length);
        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + " ");
        }
        System.out.println(); 
    }
}
