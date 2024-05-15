public class ShellSort {
    public static void main(String args[]){
        int array[] = {5, 11, 78, 3, 1, 35, 6, 8};
        int newElement = array[array.length/2];
        for(int gap = array.length/2; gap > 0; gap = gap/2){

            System.out.print("gap " + gap + ": ");
            for(int j = 0; j < array.length; j++){
                System.out.print(array[j] + " ");
            }
            System.out.println();

            for(int i = gap; i < array.length; i++){

                System.out.println("\ti: " + i);
                System.out.println("\tne: " + newElement);
                if(i - gap >= 0)
                    System.out.println("\tarray[i-gap]: " + array[i - gap]);
                System.out.print("\t");
                for(int j = 0; j < array.length; j++){
                    System.out.print(array[j] + " ");
                }
                System.out.println();

                if(array[i - gap] > newElement){
                    array[i] = array[i - gap];
                }
            }
        }
    }
}

