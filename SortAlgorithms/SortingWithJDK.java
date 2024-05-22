import java.util.Arrays;

public class SortingWithJDK {
    public static void main(String args[]){
        int array[] = {23, 6, 6, 2, 4, 9, -10, 2};

        Arrays.sort(array);
        
        System.out.print("dual pivot sort: ");
        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + " ");
        }
        System.out.println(); 

        int array0[] = {23, 6, 6, 2, 4, 9, -10, 2};

        //better for larger datasets
        Arrays.parallelSort(array0);

        System.out.print("parallel sort: ");
        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + " ");
        }
        System.out.println(); 
    }
}
