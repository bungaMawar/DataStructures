package Hashtables.BucketSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {34, 64, 13, 5, 73, 6, 32, 23, 7, 39};

        bucketSort(intArray);

        for(int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void bucketSort(int[] input){
        List<Integer>[] buckets = new List[10];
        for(int i = 0; i < buckets.length; i++){
            buckets[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < input.length; i++){
            buckets[hash(input[i])].add(input[i]);
        }

        for(List bucket: buckets){
            Collections.sort(bucket);
        }

        int j = 0; 
        for(int i = 0; i < buckets.length; i++){
            for(int value: buckets[i]){
                input[j++] = value;
            }
        }
    }

    private static int hash(int value){
        return value/(int) 10;
    }
}
