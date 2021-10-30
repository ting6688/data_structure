package com.tracy.ds.service.demo1;

public class TestMyArray {

    public static void main(String[] args) {
        //创建一个可变的数组
        MyArray myArray = new MyArray();
        //获取长度
        int size = myArray.size();
        System.out.println("size:"+ size);
        // 往可变数组中添加一个元素
        myArray.add(99);
        System.out.println("size:"+myArray.size());
    }
}
