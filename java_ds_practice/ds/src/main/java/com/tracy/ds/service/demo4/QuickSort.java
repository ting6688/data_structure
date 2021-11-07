package com.tracy.ds.service.demo4;

import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{23, 1, 34, 5, 9, 0, 3};
        System.out.println("排序之前：" + Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println("排序之后：" + Arrays.toString(arr));

    }

    // 快速排序 第一版 error:StackOverflowError
    public static void quickSort(int[] arr, int start, int end) {
        int stard = arr[start];
        int low = start;
        int high = end;
        while (low < high) {
            if (arr[high] < stard) {
                // high移动到开始位置
                arr[low] = arr[high];
                low++;
                // 开始位置开始判断
                if (arr[low] > stard) {
                    arr[high] = arr[low];
                    high--;
                } else {
                    low++;
                }
            } else {
                high--;
            }
        }
        // low==high 已经找到了该元素的存放位置
        arr[low] = stard;
        //  stard左边的都小于stard ,右边的都大于stard, 左边的部分，和右边的部分分别重复此过程
        quickSort(arr, start,low);
        quickSort(arr,low+1,end);
    }
}
