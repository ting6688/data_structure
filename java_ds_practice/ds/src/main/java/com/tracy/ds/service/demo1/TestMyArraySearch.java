package com.tracy.ds.service.demo1;

public class TestMyArraySearch {

    public static void main(String[] args) {
        MyArray ma = new MyArray();
        ma.add(1);
        ma.add(2);
        ma.add(3);
        ma.add(4);
        ma.add(5);
        //调用线性查找方法
        int index = ma.search(4);
        System.out.println("index:"+index);
        //调用二分法查找
        int index2 = ma.binarySearch(4);
        System.out.println("index2:"+index2);

    }
}
