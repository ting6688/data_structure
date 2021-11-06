package com.tracy.ds.service.demo2;


/**
 * 循环的双向链表
 */
public class DoubleNode {

    // 当只有一个节点时，该节点的上一个节点、下一个节点都是它自己
    private DoubleNode pre = this;

    private DoubleNode next = this;

    private int data;

    public DoubleNode(int data) {
        this.data = data;
    }

    /**
     * 追加一个节点 感觉此处的顺序也无关
     *
     * @param node
     */
    public void after(DoubleNode node) {
//    1. 取出当前节点的下一节点 为下下节点
//    2. 新添加的节点的下一个节点为下下节点
//    3. 下下节点的上一节点为新添加的节点
//    4. 当前节点的下一节点为 新添加的节点
//    5. 新添加的节点的上一节点为当前节点
        DoubleNode nextNode = this.next;
        node.next = nextNode;
        nextNode.pre = node;
        this.next = node;
        node.pre = this;
        // 待添加节点的前后，当前节点的后一节点 ，当前节点的后一节点的前一节点
    }

    /**
     * 取出下一节点
     *
     * @return
     */
    public DoubleNode next() {
        return this.next;
    }

    /**
     * 取出上一节点
     *
     * @return
     */
    public DoubleNode pre() {
        return this.pre;
    }

    /**
     * 获取当前节点的值
     * @return
     */
    public int getData() {
        return this.data;
    }


}
