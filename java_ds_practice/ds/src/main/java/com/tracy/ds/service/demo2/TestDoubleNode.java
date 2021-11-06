package com.tracy.ds.service.demo2;

public class TestDoubleNode {

    public static void main(String[] args) {
        DoubleNode n1 = new DoubleNode(1);
        DoubleNode n2 = new DoubleNode(2);
        DoubleNode n3 = new DoubleNode(3);
        n1.after(n2);
        n2.after(n3);
        // 1 2 1
        System.out.println(n1.getData());
        System.out.println(n1.next().getData());
        System.out.println(n3.next().getData());

    }
}
