package com.tracy.ds.service.demo2;

public class MyQueue {

    int[] elements;

    public MyQueue() {
        elements = new int[0];
    }

    // 入队 在数组最后一个位置添加元素
    public void add(int element) {
        int[] newArr = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        newArr[elements.length] = element;
        elements = newArr;
    }

    // 出队列，在数组的第一个位置取出元素
    public int poll() {
        if (elements.length == 0) {
            throw new RuntimeException("queue is empty!");
        }
        // 当原数组的长度为0时，取值会出现数组越界问题
        int element = elements[0];
        // 删除数组第一个元素
        int[] newArr = new int[elements.length - 1];
        // 将原数组的的后一个元素给新数组的元素
        //todo 测试数组越界问题 结论：当newArr长度为0时，不会走这个循环，不会出现数组越界
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = elements[i + 1];
        }
        elements = newArr;
        return element;
    }

    // 判断是否为空
    public boolean isEmpty() {
        return elements.length == 0;
    }
}
