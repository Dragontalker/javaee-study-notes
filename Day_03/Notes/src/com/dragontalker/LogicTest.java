package com.dragontalker;

public class LogicTest {

    public static void main(String[] args) {

        // 区分& 与 &&
        // 相同点1：& 与 && 的运算结果相同
        // 相同点2：当符号左边是true时，二者都会执行符号右边的运算
        // 不同点：当符号左边是false时，&继续执行符号右边的运算， &&不再执行符号右边的运算
        boolean b1 = true;
        int num1 = 10;
        if(b1 & (num1++ > 0)) {
            System.out.println("我现在在北京");
        } else {
            System.out.println("我现在在南京");
        }
        System.out.println(num1);

        boolean b2 = false;
        int num2 = 10;
        if(b2 && (num2++ > 0)) {
            System.out.println("我现在在北京");
        } else {
            System.out.println("我现在在南京");
        }
        System.out.println(num2);
    }
}