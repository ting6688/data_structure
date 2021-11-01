package com.tracy.ds.service.demo2;

import com.tracy.ds.service.demo1.MyStack;

public class TestMyStack {

    public static void main(String[] args) {
        com.tracy.ds.service.demo1.MyStack ms = new MyStack();
        System.out.println("stack is empty:"+ms.isEmpty());
        ms.push(9);
        ms.push(8);
        ms.push(7);
        System.out.println("stack pop:"+ms.pop());
        System.out.println("stack peek1:"+ms.peek());
        System.out.println("stack peek2:"+ms.peek());
        System.out.println("stack is empty:"+ms.isEmpty());



    }
}
