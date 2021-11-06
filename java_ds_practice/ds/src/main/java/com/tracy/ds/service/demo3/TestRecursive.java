package com.tracy.ds.service.demo3;

public class TestRecursive {

    public static void main(String[] args) {
        int result = febonacci(5);
        System.out.println(result);
    }

    /**
     * 斐波那契数列 1 1 2 3 5 8 13
     *
     * @param data
     * @return
     */
    public static int febonacci(int data) {
        if (data < 0) {
            throw new RuntimeException("data exception!");
        }
        if (data == 1 || data == 2) {
            return 1;
        }
        return febonacci(data - 1) + febonacci(data - 2);
    }
}
