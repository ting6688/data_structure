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
        System.out.println("currentNode:" + currentNode.getData());
        // 寻找当前节点的下一节点，当不为空时，继续寻找，当为空时，将目标节点追加在其后面
        Node nextNode = currentNode.next;
        while (nextNode != null) {
            currentNode = nextNode;
            // 没有下边这一句时，程序是个死循环
            nextNode = currentNode.next;
        }
        currentNode.next = node;
        System.out.println("nextNode:" + currentNode.next.getData());
        return currentNode;
    }

    /**
     * 获取下一节点
     */
    public Node next() {
        return this.next;
    }


    // 删除下一个节点 （为什么是下一个节点？ 因为是单链表，只有一个方向，只能找到下一个节点，不能往上找到上一个节点）
    public void removeNext() {
        // 找到被删除的节点的下一个节点 / 取出下下一个节点
        Node newNextNode = this.next.next;
        // 被删除节点的下一个节点作为被删除节点的上一个节点的下一个节点
        this.next = newNextNode;
    }

    /**
     * 展示节点内容
     */
    // 此方法缺少第一个节点的值
    public void show_lack_first() {
        Node currentNode = this;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            System.out.print(currentNode.data + " ");
        }
        System.out.println("");
    }

    /**
     * 显示所有节点信息
     */
    public void show() {
        Node currentNode = this;
        System.out.print(currentNode.data + " ");
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            System.out.print(currentNode.data + " ");
        }
        System.out.println("");
    }

    /**
     * 显示所有节点信息
     */
    public void show_v1() {
        Node currentNode = this;
        while (currentNode.next != null) {
            // 此种方法会丢掉最后一个节点
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
//            System.out.print(currentNode.data +" ");
        }
        System.out.println("");
    }

    /**
     * 插入节点 初步测试认为最后两步的顺序无关
     *
     * @param node
     */
    public void after(Node node) {
        // 取出下下节点
        Node nextNextNode = this.next;
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
    public void afterV1(Node node) {
        // 取出下下节点
        Node nextNextNode = this.next;
        // 将当前的节点的下一节点指向待插入节点
        this.next = node;
        // 将待插入的节点的下一个节点指向下下节点
        node.next = nextNextNode;
    }

}
