package com.tracy.ds.service.demo4;


import java.util.Arrays;

/**
 * 插入排序
 * 默认待排序的数字前面都是有序的，待排序的数字与之前的数字挨个比较，放入合适的位置
 */
public class InsertSort {

    public static void main(String[] args) {

        int[] arr = new int[]{6, 1, 8, 0, 9, 2, 10};
        System.out.println("排序之前:" + Arrays.toString(arr));
        insertSort(arr);
        System.out.println("排序之后:" + Arrays.toString(arr));


    }


    public static void insertSort(int[] arr) {
        // 循环每一个元素，找到自己的合适位置
        if (arr.length > 1) {
            // 大于1个元素才需要排序
            for (int i = 1; i < arr.length - 1; i++) {
                int tmp =arr[i];
                int j = i - 1;
                if (j > -1) {
                    // 当后面的数字比前面数字大的时候，不动，开始下一个数字
                    // 当后面的数字比前面数字小的时候，考虑后面的数字该放在哪，这时候需要往前移动，需要找一个合适的位置，不断往前移动，当找到比待排序的数字小的数字即停止，这个数字放在后面
                    while (j > -1 && arr[j] > tmp) {
                        arr[j + 1] = arr[j];
                        // 当后面的数字比前面的数字小的时候，需要往前移动
                        j--;

                    }
                    // 当经历过j--之后，再去交换
                    if (i > j + 1) {
//                        if (j == -1) {
//                            j = 0;
//                        }
                        arr[j+1] = tmp;
                    }
                    // 当后面的数字比前面的数字大的时候
                }
            }
        }

    }
}
