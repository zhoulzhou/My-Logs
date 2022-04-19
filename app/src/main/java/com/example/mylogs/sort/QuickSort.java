package com.example.mylogs.sort;

/**
 * 从序列中，任选一个记录k作为轴值pivot，一般选第一个元素
 *
 * 选择策略：第一个元素 或 最后一个元素 或 中间元素 或 随机选择
 *
 * 将剩余的元素，分割成 左子序列 L 和 右子序列 R
 * L 中所有元素都 < k， R 中所有元素都 > k
 * 对 L 和 R递归进行快排，直到子序列中有 0 个 或者 1 个元素，退出
 */
public class QuickSort {
    public static int partition(int[] array, int left, int right){
        int baseKey = array[left];
        int basePointer = left;

        while (left < right){
            while (left < right && array[left] <= baseKey){
                left ++;
            }
            while (left < right && array[right] >= baseKey){
                right --;
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
