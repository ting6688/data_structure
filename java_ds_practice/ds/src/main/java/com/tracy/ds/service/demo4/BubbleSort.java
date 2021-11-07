package com.tracy.ds.service.demo4;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[]{9, 1, 23, 4, 66, 93, 0, 34};
        System.out.println("排序之前：" + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("排序之后：" + Arrays.toString(arr));

    }

    /**
     * 冒泡排序：思想--像水中的泡泡一样，大的泡泡会沉到水底，相邻两个元素相比，当左边的大于右边的元素时，两者交换位置
     */
    public static void bubbleSort(int[] arr) {
        // 两轮循环：第一轮循环决定需要排序的次数，排序完所有数字 第二轮循环决定选出最大值的次数，是每一个数字排序需要比较的次数
        for (int i = 0; i < arr.length - 1; i++) {
            // 每一次循环都会找出一个最大的数，下一次循环需要排序进行比较的数就减1
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }


    }

}
