public class InsertionSort {
    public static void main(String args[]){
        int array[] = {9, 7, 2, 34, -5, 6, 8, 18};
        //int array[] = {20, 35, -15, 7, 55, 1, -22};
        for(int i = 0; i < array.length; i++){
            int newElement = array[i];
            //iterate through sorted partition
            for(int x = i; x >= 0; x--){

                System.out.print("\t");
                for(int j = 0; j < array.length; j++){
                    System.out.print(array[j] + " ");
                }
                System.out.println(); 
                               
                if(x == 0){
                    array[0] = newElement;
                    break;
                } else if(array[x - 1] > newElement){
                    array[x] = array[x - 1];
                } else if(array[x - 1] <= newElement){
                    array[x] = newElement;
                    break;
                }

            }
            System.out.print("itr " + i + ": ");
            for(int j = 0; j < array.length; j++){
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }
    }
}
