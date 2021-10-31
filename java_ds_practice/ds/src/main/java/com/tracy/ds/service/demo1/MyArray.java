package com.tracy.ds.service.demo1;

import java.util.Arrays;

public class MyArray {

    //目标数组，用于存储数据的数组
    private int[] elements;

    public MyArray() {
        elements = new int[0];
    }

    // 获取数组的长度
    public int size() {
        return elements.length;
    }

    //往数组的末尾添加一个元素
    public void add(int element) {
        // 创建一个新的数组
        int[] newArr = new int[elements.length + 1];
        // 把原数组中的元素复制到新数组中---循环原数组，因为数组长度以原数组的长度为主
//        // error: java.lang.ArrayIndexOutOfBoundsException: 0
//        for (int i : newArr) {
//            System.out.println("i:"+i);
//           // elements[0] java.lang.IndexOutOfBoundsException : Invalid array range: 0 to 0
//            newArr[i] = elements[i];
//        }

        // ✅
//        for (int i = 0; i < newArr.length-1; i++) {
//            newArr[i] = elements[i];
//        }

        // ✅
        for (int i = 0; i < elements.length; i++) {
            System.out.println("i:" + i);
            newArr[i] = elements[i];
        }

        // error: newArr 长度非0 而elements长度为0 elements[0] 会报数组索引越界的问题
//        for (int i : newArr) {
//            System.out.println("i:"+i);
//            newArr[i] = elements[i];
//        }

        // 把添加的元素放入新数组中
        newArr[newArr.length - 1] = element;
        // 新数组替换掉原数组
        elements = newArr;
    }

    // 打印所有元素到控制台
    public void show() {
        System.out.println(Arrays.toString(elements));
    }

    // 删除数组中的元素
    public void delete(int index) {
        //判断下标是否越界
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界");
        }
        // 创建一个新的数组，长度为原数组的长度-1
        int[] newArr = new int[elements.length - 1];
        // 复制原有数据到新数组
        for (int i = 0; i < newArr.length; i++) {
            // 想要删除的元素的前面的元素，相同位置上值一样
            if (i < index) {
                newArr[i] = elements[i];
            } else {
                // 想要删除的后面的元素，整体往前挪动一位
                newArr[i] = elements[i + 1];
            }
        }
        // 新数组替换掉原数组
        elements = newArr;
    }

    // 取出指定位置的元素
    public int get(int index) {
        //判断下标是否越界
        // Exception in thread "main" java.lang.RuntimeException: 下标越界
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界");
        }
        return elements[index];
    }

    // 插入一个元素到指定位置
    public void insert(int index, int element) {
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界");
        }
        // 创建一个新的数组
        int[] newArr = new int[elements.length + 1];
        // 插入位置之前的 直接复制，插入位置之后的，新数组中位置加1，新插入的元素放到index上
        for (int i = 0; i < elements.length; i++) {
            if (i < index) {
                newArr[i] = elements[i];
            } else {
                newArr[i + 1] = elements[i];
            }
        }
        newArr[index] = element;
        // 新数组替换掉原数组
        elements = newArr;
    }

    // 替换指定位置的元素
    public void set(int index, int element) {
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界");
        }
        elements[index] = element;
    }

    // 线性查找
    public int search(int target) {
        //遍历数组
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // 二分法查找
    public int binarySearch(int target) {
        // 二分法查找要求数组必须有序
//        int[] arr = new int[]{2, 4, 5, 7, 9, 13, 17, 18};
        // 目标元素
//        int target = 10; // 查找一个不存在的值时会出现死循环 while(true) 改为 while(begin<end)

        // 记录开始位置
        int begin = 0;
        // 记录结束位置
        int end = elements.length - 1;
        // 记录中间的位置
        int mid = (begin + end) / 2;
        // 记录目标位置
        int index = -1;
        // 循环查找
//        while (begin < end) {
        while (true) {
            //什么情况下没有这个元素？ 开始在结束位置之后或重合，没有这个元素
            if (begin >= end) {
                return -1;
            }
            System.out.println("begin:" + begin + ",end:" + end + ",mid:" + mid);
            // 判断中间的这个元素是不是要查找的元素
            if (elements[mid] == target) {
                index = mid;
                return mid;
                // 中间这个元素不是要查找的元素
            } else {
                // 判断中间这个元素是不是比目标的元素大
                if (elements[mid] > target) {
                    // 把结束位置调整到中间位置的前一个位置
                    end = mid - 1;
                } else {
                    // 中间这个元素比目标元素小,把开始位置调整到中间位置的后一个位置
                    begin = mid + 1;
                }
                mid = (begin + end) / 2;
            }
        }
        // Unreachable statement
//        return index;
//        System.out.println("index:" + index);
    }

}
