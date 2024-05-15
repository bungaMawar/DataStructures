public class SelectionSort {
    public static void main(String args[]){
        //int array[] = {6, 5, -4, 7, 45, 87, 1, 4};
        int array[] = {56, 3, 3, 13, 4, 78, 9, 12};
        //go through every element of the array
        for(int i = 0; i < array.length - 1; i++){
            //store max
            int maxIndex = 0;
            int max = array[0];
            for(int x = 0; x < array.length - 1 - i; x++){
                if(array[x] > max){
                    maxIndex = x;
                    max = array[x];
                }
            }
            int temp = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[maxIndex];
            array[maxIndex] = temp;
            System.out.print("i " + i + ": ");
            for(int j = 0; j < array.length; j++){
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
