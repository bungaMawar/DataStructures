public class MergeSortDescending {
    private static void mergeSort(int[] input, int start, int end){
        if(end - start < 2){
            return;
        }

        int midpoint = (start + end)/2;

        mergeSort(input, start, midpoint);
        mergeSort(input, midpoint, end);

        merge(input, start, midpoint, end);

    }

    private static void merge(int[] input, int start, int midpoint, int end){
        //optimization
        //if whatever is at midpoint is greater than the element before it
        //everything is already sorted anyway, so theres nothing to do here
        if(input[midpoint - 1] >= input[midpoint]){
            return;
        }

        int i = start;
        int j = midpoint;
        int index = 0;

        int[] temp = new int[end - start];
        while(i < midpoint && j < end){
            temp[index++] = input[i] >= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + index, midpoint - i);
        System.arraycopy(temp, 0, input, start, index);
    }
    public static void main(String args[]){
        int array[] = {4, 7, 23, 74, 4, 7, 0, -5};
        //int array[] = {20, 35, -15, 7, 55, 1, -22};
        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + " ");
        }
        System.out.println();
        mergeSort(array, 0, array.length);
        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + " ");
        }
        System.out.println();    
    }
}