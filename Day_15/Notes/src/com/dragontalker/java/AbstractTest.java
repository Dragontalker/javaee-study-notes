package com.dragontalker.java;

/*
abstract关键字的使用
    1. abstract: 抽象的
    2. abstract可以用来修饰的结构、类、方法
    3. abstract修饰类: 抽象类
        > 此类不能实例化
        > 抽象类中一定有构造器, 便于子类实例化时调用(涉及: 子类对象实例化的全过程)
        > 开发中, 都会提供抽象类的子类, 让子类对象实例化, 完成相关的操作

    4. abstract修饰方法: 抽象方法
        >
 */

public class AbstractTest {
    public static void main(String[] args) {

        //一旦Person类抽象了, 就不可实例化
        //Person p1 = new Person();
        //p1.eat();
    }
}

abstract class Person {
    String name;
    int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //不是抽象方法:
    //public void eat() {}

    //抽象方法:
    public abstract void eat();

    public void walk() {
        System.out.println("人走路");
    }
}

class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }
}
