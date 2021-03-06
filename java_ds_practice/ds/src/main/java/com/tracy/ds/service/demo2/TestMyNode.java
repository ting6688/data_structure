package com.tracy.ds.service.demo2;

public class TestMyNode {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
//        System.out.println(node1.getData());
//        System.out.println(node2.getData());
//        System.out.println(node3.getData());
//        // node节点的追加方式 不灵活 ，有没有一种方式实现一个节点一直往后追加，被追加的节点挂在上一节点的后面，就像火车一样
//        node1.append(node2);
//        node2.append(node3);
//        // 2
//        System.out.println(node1.next.getData());
//        // 3
//        System.out.println(node1.next.next.getData());

//        node1.append_ext(node2);
//        node2.append_ext(node3);
//        // 2
//        System.out.println(node1.next.getData());
//        // 3
//        System.out.println(node1.next.next.getData());

        node1.append_ext(node2).append_ext(node3).append_ext(new Node(4));
//        node2.append_ext(node3);
        //System.out.println(node1.next.getData());
        // 3
        // System.out.println(node1.next().next().getData());
        // 1 2 3 4
        node1.show();
//        node1.removeNext();
        // 1 3 4
//        node1.show();


        // 插入节点
        Node node5 = new Node(5);
        node1.next.after(node5);
        // 1 2 5 3 4
        node1.show();

//        node1.next.afterV1(node5);
//        // 1 2 5 3 4
//        node1.show();


    }
}
