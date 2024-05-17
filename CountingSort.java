public class CountingSort {
    public static void main(String args[]){
        int array[] = {1, 2, 10, 1, 4, 5, 4, 7, 4, 9};
        int[] countingArray = new int[array.length];

        for(int i = 0; i < countingArray.length; i++){
            countingArray[i] = 0;
        }

        for(int i = 0; i < array.length; i++){
            countingArray[array[i] - 1]++;
        }

        System.out.print("counting array: ");
        for(int j = 0; j < countingArray.length; j++){
            System.out.print(countingArray[j] + " ");
        }
        System.out.println();    
        
        int arrayIndex = 0;
        for(int i = 0; i < countingArray.length; i++){
            if(countingArray[i] > 0){
                int temp = countingArray[i];
                while(temp != 0){
                    array[arrayIndex] = i + 1;
                    arrayIndex++;
                    temp--;
                }
            }
        }

        System.out.print("array: ");
        for(int j = 0; j < countingArray.length; j++){
            System.out.print(array[j] + " ");
        }
        System.out.println(); 
    }
}
