package com.example.mylogs.sort;

public class SelectSort {
    public static void sort(int[] array){
        if(array == null || array.length == 0){
            return;
        }

        int minIndex = 0;
        for (int i=0; i<array.length-1; i++){
            minIndex = i;
            for (int j=i+1; j<array.length; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }

            if (minIndex != i){
                swap(array, minIndex, i);
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
        String s = "";
        for (int i=0; i<array.length; i++){
            s += array[i] + "  ";
        }
        System.out.println(" array= " + s);
    }

    public static void test(){
        System.out.println("---- test  ---");
        int[] array = {4,3,7,9,12,42,5,22,6,8,2,34,1};
        sort(array);
    }
}
