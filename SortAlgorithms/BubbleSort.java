public class BubbleSort {
    public static void main(String args[]){
        //int array[] = {56, 3, 3, 13, 4, 78, 9, 12};
        int array[] = {6, 5, -4, 7, 45, 87, 1, 4};
        //go through every element of the array
        for(int i = 0; i < array.length - 1; i++){
            //go through every element of the array except
            //for the sorted bits at the end
            for(int x = 0; x < array.length - 1 - i; x++){
                //if current element in is greater than 
                //element in front of it, swap places
                if(array[x] > array[x + 1]){
                    int temp = array[x];
                    array[x] = array[x + 1];
                    array[x + 1] = temp;
                }
                System.out.print("i " + i + ", x "+ x + ": ");
                for(int j = 0; j < array.length; j++){
                    System.out.print(array[j] + " ");
                }                
                System.out.println();
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
