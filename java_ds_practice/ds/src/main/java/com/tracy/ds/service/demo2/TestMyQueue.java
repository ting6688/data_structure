package com.tracy.ds.service.demo2;

public class TestMyQueue {

    public static void main(String[] args) {
        MyQueue mq = new MyQueue();
        System.out.println("isEmpty1:"+mq.isEmpty());
//        System.out.println("出队列1:"+mq.poll());
        mq.add(9);
        System.out.println("出队列2:"+mq.poll());
        mq.add(8);
        mq.add(7);
        System.out.println("出队列3:"+mq.poll());
        mq.add(6);
        System.out.println("出队列4:"+mq.poll());
        System.out.println("出队列5:"+mq.poll());
        System.out.println("isEmpty2:"+mq.isEmpty());





    }
}

