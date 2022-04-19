package com.example.mylogs.sort;

/**
 *
 * 顾名思义，冒泡排序就是像水中的泡泡一样，
 * 两个相邻的数比较大小，将两个数中较大的数往右边放，小的往左边放
 */
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
