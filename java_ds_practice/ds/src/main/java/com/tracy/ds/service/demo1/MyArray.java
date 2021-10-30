package com.tracy.ds.service.demo1;

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
    public void add(int element){
        // 创建一个新的数组
        int[] newArr = new int[elements.length+1];
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
            System.out.println("i:"+i);
            newArr[i] = elements[i];
        }

        // error: newArr 长度非0 而elements长度为0 elements[0] 会报数组索引越界的问题
        for (int i : newArr) {
            System.out.println("i:"+i);
            newArr[i] = elements[i];
        }

        // 把添加的元素放入新数组中
        newArr[newArr.length-1] = element;
        // 新数组替换掉原数组
        elements = newArr;
    }
}
