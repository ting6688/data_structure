package com.tracy.ds.service.demo4;


import java.util.Arrays;

/**
 * 插入排序
 * 默认待排序的数字前面都是有序的，待排序的数字与之前的数字挨个比较，放入合适的位置
 */
public class InsertSort {

    public static void main(String[] args) {

        int[] arr = new int[]{6, 1, 8, 0, 9, 2, 10,3,4};
        int[] arr2 = new int[]{6};

        System.out.println("排序之前:" + Arrays.toString(arr));
        insertSort(arr2);
        System.out.println("排序之后:" + Arrays.toString(arr));


    }


    public static void insertSort(int[] arr) {
        // 循环每一个元素，找到自己的合适位置
//        if (arr.length > 1) { //  这块不需要了，当length为1时，下面的for循环会直接退出
            // 大于1个元素才需要排序 // i<length-1 会漏掉最后一个元素
            for (int i = 1; i < arr.length; i++) {
                int tmp =arr[i];
                int j = i - 1;
//                if (j > -1) {
                    // 当后面的数字比前面数字大的时候，不动，开始下一个数字
                    // 当后面的数字比前面数字小的时候，考虑后面的数字该放在哪，这时候需要往前移动，需要找一个合适的位置，不断往前移动，当找到比待排序的数字小的数字即停止，这个数字放在后面
                    while (j > -1 && arr[j] > tmp) {
                        arr[j + 1] = arr[j];
                        // 当后面的数字比前面的数字小的时候，需要往前移动
                        j--;

                    }
                    // 当经历过j--之后，再去交换
                    // 也可能出现 后面的数字大于前面的数字，直接下一个数字；也可能是后面的数字（待排序数字）小于前面而不断左移，直到遇到待排序数字大于前面数字的时候，需要插入；两种情况下才会执行下面的语句；
                    if (i > j + 1) {
//                        if (j == -1) {
//                            j = 0;
//                        }
                        arr[j+1] = tmp;
                    }
                }
            }
//        }

}
