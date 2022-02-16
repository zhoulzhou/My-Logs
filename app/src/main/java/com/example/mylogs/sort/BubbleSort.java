package com.example.mylogs.sort;

public class BubbleSort {

    public static void sort(int[] array){
        if(array == null || array.length == 0){
            return;
        }

        for (int i=0; i<array.length -1; i++){
            for (int j=array.length-1; j>i; j--){
                if(array[j] < array[j-1]){
                    swap(array, j-1, j);
                }
            }
        }

        printArray(array);
    }

    private static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println(" array= " + array[i]);
        }
    }

    public static void test(){
        System.out.println("---- test  ---");
        int[] array = {4,3,7,9,12,42,5,22,6,8,2,34,1};
        sort(array);
    }
}