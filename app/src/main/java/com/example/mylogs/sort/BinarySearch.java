package com.example.mylogs.sort;

/**
 * 在有序的列表中
 * 将列表中间位置元素和目标元素进行比较，
 * 如果相等，则查找成功；
 * 如果不相等，则查找的元素一定在表的前半部分或后半部分。
 * 在判断，如果目标元素大于中间元素，则进一步查找后半部分，否则进一步查找前半部分。
 * 重复以上过程，直到找到满足条件的元素，使查找成功；如果还没有找到，则此元素不在列表里面。
 */
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
