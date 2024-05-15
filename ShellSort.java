public class ShellSort {
    public static void main(String args[]){
        int array[] = {5, 11, 78, 3, 1, 35, 6, 8};
        for(int gap = array.length/2; gap > 0; gap /= 2){
            System.out.println("gap " + gap + ": ");
            for(int j = 0; j < array.length; j++){
                System.out.print(array[j] + " ");
            }
            System.out.println();

            for(int i = gap; i < array.length; i++){
                int newElement = array[i];

                int x = i;

                while(x >= gap && array[x - gap] > newElement){
                    array[x] = array[x - gap];
                    x -= gap;
                }

                array[x] = newElement;
            }
        }

        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + " ");
        }
        System.out.println();    
    }
}

