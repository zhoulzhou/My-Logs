package com.example.mylogs.sort;

public class QuickSort {
    public static int partition(int[] array, int left, int right){
        int baseKey = array[left];
        int basePointer = left;

        while (left < right){
            while (left < right && array[right] >= baseKey){
                right --;
            }
            while (left < right && array[left] <= baseKey){
                left ++;
            }
            swap(array, left, right);
        }

        swap(array, basePointer, left);
        return left;
    }

    public static void quickSort(int[] array, int left, int right){
        if(left > right){
            return;
        }


        System.out.println("-----partition---");
        int basePos = partition(array, left, right);
        printArray(array);


        System.out.println("-----quickSort 111---");
        quickSort(array, left, basePos-1);
        printArray(array);


        System.out.println("-----quickSort 222---");
        quickSort(array, basePos+1, right);
        printArray(array);

    }

    public static void sort(int[] array){
        if(array == null || array.length == 0){
            return;
        }

        quickSort(array, 0, array.length-1);
    }

    public static void test(){
        System.out.println("---- test  ---");
        int[] array = {4,3,7,9,12,42,5,22,6,8,2,34,1};
        printArray(array);

        sort(array);
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
}
