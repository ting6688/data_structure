package com.tracy.ds.service.demo4;


import java.util.Arrays;

/**
 * 插入排序
 * 默认待排序的数字前面都是有序的，待排序的数字与之前的数字挨个比较，放入合适的位置
 */
public class InsertSort {

    public static void main(String[] args) {

        int[] arr = new int[]{6,1,8,0,9,2,10};
        insertSort(arr);
        System.out.println("排序之前:" + Arrays.toString(arr));
        System.out.println("排序之后:" + Arrays.toString(arr));


    }


    public static void insertSort(int[] arr) {
        // 循环每一个元素，找到自己的合适位置
        if (arr.length > 1) {
            // 大于1个元素才需要排序
            for (int i = 1; i < arr.length - 1; i++) {
                // 默认第一个有序，开始排第二个元素
//                if (i == 1) {
//                    if (arr[i] > arr[i - 1]) {
//                        // 不动，继续排下一个
//                    } else {
//                        // arr[1] < arr[0] arr[0]会插入到arr[1]
//                        int tmp = -1;
//                        tmp = arr[i];
//                        arr[i] = arr[i - 1];
//                        arr[i - 1] = tmp;
//                    }
//                }
//
//                if (i == 2) {
                int tmp = arr[i];
                int j = i - 1;
                while (j >-1) {
                    // 遇到比前面数字小的数字，再往前挪，直到前面没有数字
                    while (j>0 && arr[j] > arr[i]) {
                        j--;
                    }
                    tmp = arr[i];
                    arr[j + 1] = arr[j];
                    // 如果遇到比待排序数字小的数字，则把待排序数字放在中间位置
//                    arr[i] = arr[j + 1];
                    arr[j] = tmp;
                }
            }
        }

    }
}
