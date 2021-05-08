package com.dragontalker;

/*
面向对象的特征一: 封装与隐藏
 */

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "大黄";
        a.age = 1;
        a.legs = 4;
    }
}

class Animal {
    String name;
    int age;
    int legs;

    public  void eat() {
        System.out.println("动物进食");
    }
}
