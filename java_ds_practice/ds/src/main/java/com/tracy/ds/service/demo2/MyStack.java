package com.tracy.ds.service.demo2;

public class MyStack {

    // 栈的底层我们使用数组来存储数据
    int[] elements;

    public MyStack() {
        elements = new int[0];
    }

    // 将元素压入栈,放在数组的末尾
    public void push(int element) {
        // 在数组的最后一个位置添加元素
        int[] newArr = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        newArr[elements.length] = element;
        elements = newArr;
    }

    // 将元素从栈中取出，从数组的最后一个位置（栈顶）取出元素
    public int pop() {
        // 栈中没有元素
        if (elements.length == 0) {
            throw new RuntimeException("stack is empty!");
        }
        // 从数组的最后一个位置取出元素，将最后一个位置删掉
        int element = elements[elements.length - 1];
        // 删掉最后一个元素
        int[] newArr = new int[elements.length - 1];
        for (int i = 0; i < elements.length - 1; i++) {
            newArr[i] = elements[i];
        }
        elements = newArr;
        return element;
    }

    // 判断栈是否为空
    public boolean isEmpty() {
        return elements.length == 0;
    }

    // 取出栈顶元素
    public int peek() {
        if (elements.length == 0) {
            throw new RuntimeException("stack is empty!");
        }
        return elements[elements.length - 1];
    }
}
