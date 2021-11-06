package com.tracy.ds.service.demo2;

/**
 * 循环链表，链表的最后一个节点指向开始节点
 */
public class LoopNode {
    public int data;

    // 循环链表中，只有一个节点时，当前节点的下一个节点是它自己
    public LoopNode next = this;

    public LoopNode(int data) {
        this.data = data;
    }


    /**
     * 获取节点数据
     *
     * @param LoopNode
     * @return
     */
    public int getData() {
        return data;
    }



    /**
     * 获取下一节点
     */
    public LoopNode next() {
        return this.next;
    }


    // 删除下一个节点 （为什么是下一个节点？ 因为是单链表，只有一个方向，只能找到下一个节点，不能往上找到上一个节点）
    public void removeNext() {
        // 找到被删除的节点的下一个节点 / 取出下下一个节点
        LoopNode newNextNode = this.next.next;
        // 被删除节点的下一个节点作为被删除节点的上一个节点的下一个节点
        this.next = newNextNode;
    }


    /**
     * 插入节点 跟单链表的实现逻辑一样
     *
     * @param node
     */
    public void after(LoopNode node) {
        // 取出下下节点
        LoopNode nextNextNode = this.next;
        // 将待插入的节点的下一个节点指向下下节点
        node.next = nextNextNode;
        // 将当前的节点的下一节点指向待插入节点
        this.next = node;
    }

    /**
     * 插入节点
     *
     * @param node
     */
    public void afterV1(LoopNode node) {
        // 取出下下节点
        LoopNode nextNextNode = this.next;
        // 将当前的节点的下一节点指向待插入节点
        this.next = node;
        // 将待插入的节点的下一个节点指向下下节点
        node.next = nextNextNode;
    }

}
