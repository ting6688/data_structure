package com.tracy.ds.service.demo3;

/**
 * 汉诺塔问题
 */
public class Hanoi {
    public static void main(String[] args) {

//        hanoi_plate(5, 'A', 'B', 'C');
        hnt(3, 'A', 'B', 'C');

    }


    /**
     * 汉诺塔移动盘子问题
     *
     * @param n    一共有多少个盘子
     * @param from 开始的柱子
     * @param mid  中间的柱子
     * @param to   结束的柱子
     *             无论有多少个盘子，都认为只有两个，上面的所有盘子和最下面一个盘子
     *             通过汉诺塔问题理解递归思想
     *             1、移动一个盘子，从A到C
     *             2、移动两个盘子，需要将第一个盘子从A移到B，将最后一个盘子从A移到C，再将盘子从B移到C
     *             移动三个盘子时，同样思想，需要将前两个盘子从A移到B ，将最后一个盘子从A移到C,再将前两个盘子从B移到C
     *             而将前两个盘子从A移到C ，就是重复第二步的过程
     *             为了解决第N个问题，需要先解决第N-1个问题，而为了解决第N-1个问题，需要先解决第N-2个问题，直到解决第1个问题。而且在这
     *             其中，前面第N个问题、第N-1个问题，直到倒数第2个问题的解决算法，都是一致的；
     */
    public static void hanoi_plate(int n, char from, char mid, char to) {
        if (n == 1) {
            System.out.println("第1个盘子从" + from + "移到" + to);
        } else {
            // 移动上面所有盘子到中间位置
            hanoi_plate(n - 1, from, to, mid);
            // 移动最后一个盘子到目标位置
            System.out.println("第" + n + "个盘子从" + from + "移到" + to);
            // 移动上面所有盘子从中间位置到目标位置
            hanoi_plate(n - 1, mid, from, to);
        }
    }


    /**
     * 自己参照网上讲解实现
     * @param n
     * @param from
     * @param tmp
     * @param to
     */
    public static void hnt(int n, char from, char tmp, char to) {
        if (n == 1) {
            move(1, from, to);
        } else {
            hnt(n - 1, from, to,tmp);
            move(n, from, to);
            hnt(n - 1, tmp,from, to);
        }
    }


    public static void move(int n, char from, char to) {
        System.out.println("将第" + n + "个盘子从" + from + "移到" + to);
    }
}
