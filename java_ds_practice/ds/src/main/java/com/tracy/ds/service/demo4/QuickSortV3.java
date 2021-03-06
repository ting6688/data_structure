package com.tracy.ds.service.demo4;

import java.util.Arrays;

/**
 * 快速排序
 * 双指针排序法，两指针有一方停下时，即交换左右指针，两指针相遇时。左指针和基准数交换
 */
public class QuickSortV3 {

    public static void main(String[] args) {
        int[] arr = new int[]{23, 1, 34, 5, 9, 0, 3};
        System.out.println("排序之前：" + Arrays.toString(arr));
        QuickSortV4(arr, 0, arr.length - 1);
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

    /**
     * 快速排序，升序排序
     *
     * @param arr   待排序的数组
     * @param start 开始位置下标
     * @param end   结束位置下标
     */
    public static void QuickSortV3(int[] arr, int start, int end) {
        if (start < end) {
            // 把数组中的第1个数字做为标准数
            int pivot = arr[start];
            // 记录需要排序的下标
            int low = start;
            int high = end;
            int tmp = 0;
            // 右指针左移直到找到比基准数小的数字，停止，左指针右移直到直到比基准数大的数字，停止，两者交换；
            // 当两指针相等时，基准数和指针位置上的数字交换
            while (low != high) {
                while (arr[high] >= pivot) {
                    high--;
                }
                while (arr[low] <= pivot) {
                    low++;
                }
                if (low < high) {
                    tmp = arr[high];
                    arr[high] = arr[low];
                    arr[low] = tmp;
                }
            }
            // low==high 已经找到了该元素的存放位置
            arr[low] = pivot;
            //  pivot左边的都小于pivot ,右边的都大于pivot, 左边的部分，和右边的部分分别重复此过程
            QuickSortV3(arr, start, low);
            QuickSortV3(arr, low + 1, end);
        }
    }


    public static void QuickSortV4(int[] arr, int start, int end) {
        //todo
        System.out.println("start:"+start+",end:"+end);
        int stard = arr[start];
        int low = start;
        int high = end;
        if (start < end) {
            // 需要排序时进行排序，当二者相等时，即只剩一个元素，无需排序
            while (low < high) {
                // 从右指针开始循环,从右边找到比基准数小的数，交换位置
                while (low < high && stard <= arr[high]) {
                    high--;
                }
                arr[low] = arr[high];
                while (low < high && stard >= arr[low]) {
                    // 从左指针寻找比基准数大的数，交换位置
                    low++;
                }
                arr[high] = arr[low];
            }
            // low == high  左右指针重合，交换基准数和左指针位置上的元素
            int tmp = 0;
            tmp = stard;
            stard = arr[low];
            arr[low] = tmp;
            //  重复此过程，每一个元素都找到正确的位置
//            QuickSortV4(arr, start, low - 1);
//            QuickSortV4(arr, low + 1, end);
        }
        // 栈溢出问题
//        //  重复此过程，每一个元素都找到正确的位置
        QuickSortV4(arr, start, low - 1);

        QuickSortV4(arr, low + 1, end);

    }
}
