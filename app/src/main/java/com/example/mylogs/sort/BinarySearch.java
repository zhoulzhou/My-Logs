package com.example.mylogs.sort;

public class BinarySearch {

    public static int search(int[] array, int key){
        int length = array.length;

        QuickSort.quickSort(array, 0, length-1);
        printArray(array);

        int begin = 0;
        int end = length-1;

        while (begin < end){
            int mid = (begin + end)/2;
            int now = array[mid];
            if(now == key){
                return mid;
            }
            if(now < key){
                begin = mid + 1;
            }
            if(now > key){
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void test(){
        System.out.println("---- test  ---");
        int[] array = {4,3,7,9,12,42,5,22,6,8,2,34,1};
        int result = search(array, 8);

        System.out.println("---- test  result= " + result);
    }

    private static void printArray(int[] array){
        String s = "";
        for (int i=0; i<array.length; i++){
            s += array[i] + "  ";
        }
        System.out.println(" array= " + s);
    }
}
