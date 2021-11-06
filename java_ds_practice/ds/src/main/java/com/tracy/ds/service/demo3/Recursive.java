package com.tracy.ds.service.demo3;

/**
 * 递归
 */
public class Recursive {

    public static void main(String[] args) {
        print(10);
    }

    public static void print(int data) {
        // 递归调用退出的条件
        if (data > 0) {
            System.out.println(data);
            print(data - 1);
        }
    }
}
