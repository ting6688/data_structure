package com.tracy.ds.service.demo2;


/**
 * 单链表 结构：数据+下一个结点
 */
public class Node {

    public int data;

    public Node next;

    public Node(int data) {
        this.data = data;
    }

    /**
     * 单链表的追加
     *
     * @param node
     */
    public void append(Node node) {
        this.next = node;
    }

    /**
     * 获取节点数据
     *
     * @param node
     * @return
     */
    public int getData() {
        return data;
    }

    /**
     * 追加节点的升级
     *
     * @param node
     */
    public Node append_ext(Node node) {
        // 当前节点
        Node currentNode = this;
        System.out.println("currentNode:"+ currentNode.getData());
        // 寻找当前节点的下一节点，当不为空时，继续寻找，当为空时，将目标节点追加在其后面
        Node nextNode = currentNode.next;
        while (nextNode != null) {
            currentNode = nextNode;
            // 没有下边这一句时，程序是个死循环
            nextNode = currentNode.next;
        }
        currentNode.next = node;
        System.out.println("nextNode:"+ currentNode.next.getData());
        return currentNode;
    }

    /**
     * 获取下一节点
     */
//    public Node next(){
//        return this.
//    }

}
