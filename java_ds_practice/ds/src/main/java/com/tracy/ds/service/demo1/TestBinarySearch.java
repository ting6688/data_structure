package com.tracy.ds.service.demo1;

public class TestBinarySearch {

    public static void main(String[] args) {
        // 二分法查找要求数组必须有序
        int[] arr = new int[]{2, 4, 5, 7, 9, 13, 17, 18};
        // 目标元素
        int target = 10; // 查找一个不存在的值时会出现死循环 while(true) 改为 while(begin<end)

        // 记录开始位置
        int begin = 0;
        // 记录结束位置
        int end = arr.length - 1;
        // 记录中间的位置
        int mid = (begin + end) / 2;
        // 记录目标位置
        int index = -1;
        // 循环查找
        while (begin<end) {
            System.out.println("begin:"+begin+",end:"+end+",mid:"+mid);
            // 判断中间的这个元素是不是要查找的元素
            if (arr[mid] == target) {
                index = mid;
                break;
                // 中间这个元素不是要查找的元素
            } else {
                // 判断中间这个元素是不是比目标的元素大
                if (arr[mid] > target) {
                    // 把结束位置调整到中间位置的前一个位置
                    end = mid - 1;
                } else {
                    // 中间这个元素比目标元素小,把开始位置调整到中间位置的后一个位置
                    begin = mid + 1;
                }
                mid = (begin + end) / 2;
            }
        }
        System.out.println("index:" + index);
    }
}
