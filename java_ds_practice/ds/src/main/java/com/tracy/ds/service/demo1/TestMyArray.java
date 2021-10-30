package com.tracy.ds.service.demo1;

public class TestMyArray {

    public static void main(String[] args) {
        //创建一个可变的数组 []
        MyArray myArray = new MyArray();
        myArray.show();

        //获取长度
        int size = myArray.size();
        System.out.println("size:" + size);
        // 往可变数组中添加一个元素 [99, 98]
        myArray.add(99);
        myArray.add(98);
        myArray.add(97);
        System.out.println("size:" + myArray.size());
        // 显示可变数组中的所有元素到控制台
        myArray.show();
        // 删除某个元素
        myArray.delete(1);
        myArray.show();
        // 2
        System.out.println(myArray.size());
        System.out.println(myArray.get(9));
    }
}
