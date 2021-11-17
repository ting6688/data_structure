package com.tracy.ds.service.demo4;


import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSortV2 {

    public static void main(String[] args) {

        int[] arr = new int[]{6, 1, 8, 0, 9, 2, 10, 3, 4};
        System.out.println("排序之前:" + Arrays.toString(arr));
        insertSortV3(arr);
        System.out.println("排序之后:" + Arrays.toString(arr));


    }


    public static void insertSortV2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // 将待排序数字和前面数字比较，当小于待排序数字时，不做任何操作；
            // 当前面数字大于待排序数字时，待排序数字最后会插入到前面数字之前，通过不断左移进行判断直到找到比待排序数字小的数字而停止，待排序数字放在其后；
            if (arr[i - 1] > arr[i]) {
                int tmp = arr[i];
                int j = -1;
                for (j = i - 1; j >= 0 && arr[j] > tmp; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[j + 1] = tmp;
            }
        }
    }


    /**
     * 第二个for换成了while
     * @param arr
     */

    //todo J>=0 === J>-1
    public static void insertSortV3(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // 将待排序数字和前面数字比较，当小于待排序数字时，不做任何操作；
            // 当前面数字大于待排序数字时，待排序数字最后会插入到前面数字之前，通过不断左移进行判断直到找到比待排序数字小的数字而停止，待排序数字放在其后；
            if (arr[i - 1] > arr[i]) {
                int tmp = arr[i];
                int j = i-1;
                while(j>-1 && arr[j] > tmp){
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = tmp;
            }
        }
    }

}
