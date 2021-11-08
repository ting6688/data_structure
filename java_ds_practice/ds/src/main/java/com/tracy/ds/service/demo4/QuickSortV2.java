package com.tracy.ds.service.demo4;

import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSortV2 {

    public static void main(String[] args) {
        int[] arr = new int[]{23, 1, 34, 5, 9, 0, 3};
        System.out.println("排序之前：" + Arrays.toString(arr));
        QuickSortV2(arr, 0, arr.length - 1);
        System.out.println("排序之后：" + Arrays.toString(arr));

    }

    // 快速排序 第二版 error:StackOverflowError
    public static void QuickSortV2(int[] arr, int start, int end) {
        if (start < end) {
            // 把数组中的第0个数字做为标准数
            int stard = arr[start];
            // 记录需要排序的下标
            int low = start;
            int high = end;
            // 循环找比标准数大的数和比标准数小的数
            while (low < high) {
                if (arr[high] < stard) {
                    // high移动到开始位置
                    arr[low] = arr[high];
                } else {
                    low++;
                }
                // 开始位置开始判断
                if (arr[low] > stard) {
                    arr[high] = arr[low];
                } else {
                    high--;
                }
            }
            // low==high 已经找到了该元素的存放位置
            arr[low] = stard;
            //  stard左边的都小于stard ,右边的都大于stard, 左边的部分，和右边的部分分别重复此过程
            QuickSortV2(arr, start, low);
            QuickSortV2(arr, low + 1, end);
        }
    }
}
