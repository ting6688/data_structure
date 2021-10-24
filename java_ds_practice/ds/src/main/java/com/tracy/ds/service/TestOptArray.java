package com.tracy.ds.service;

import java.util.Arrays;

public class TestOptArray {

    public static void main(String[] args) {
        // 解决数组长度不可变得问题
        int[] arr = new int[] {9,8,7};
        // 快速查看数组中的元素
        System.out.println(Arrays.toString(arr));
        // 要加入数据的目标元素
        int dst = 6;


        // 创建一个数组，长度是原数组长度+1
        int[] newArr = new int[arr.length +1];
         //把原数组中的数据全部复制到新数组中
        for(int i =0 ; i<arr.length; i++){
            newArr[i] = arr[i];
        }
        // 把目标元素放入新数组的最后
        newArr[arr.length] = dst;
        //新数组替换原数组
         arr = newArr;
        System.out.println(Arrays.toString(arr));


        // 我的考虑 ： 为什么不能直接赋值，然后把最后一个元素赋值，得到的结果是：[0, 0, 0, 6]
        // 创建一个数组，长度是原数组长度+1
//        int[] newArr = new int[arr.length +1];
//        // 把目标元素放入新数组的最后
//        newArr[arr.length] = dst;
//        //新数组替换原数组
//        arr = newArr;
        // 数组的拷贝是什么拷贝？ 为什么list可以呢？
    }
}
