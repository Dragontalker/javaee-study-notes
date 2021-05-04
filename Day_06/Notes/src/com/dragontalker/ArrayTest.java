package com.dragontalker;

/*
数组的特点:
    1. 数组是有序排列的;
    2. 数组属于引用数据类型的变量. 数组的元素，既可以是基本数据类型，也可以是引用数据类型;
    3. 创建数组对象会在内存中开辟一整块连续的空间;
    4. 数组的长度一旦确定，就不能修改.

数组的分类:
    1. 按照维度: 1维数组，2维数组，...
    2. 按照数组元素的类型: 基本数据类型/引用数据类型

1维数组的使用:
    1. 一维数组的声明和初始化;
    2. 如何调用数组的指定位置和元素;
    3. 如何获取数组的长度;
    4. 如何遍历数组;
    5. 数组元素的默认初始化值;
    6. 数组的内存解析.
 */

public class ArrayTest {

    public static void main(String[] args) {

        // 1. 一维数组的声明和初始化;
        int num; // 声明
        num = 10; // 初始化
        int id = 1001; // 声明 + 初始化

        int[] ids; // 声明
        ids = new int[]{1001, 1002, 1003, 1004}; // 初始化
    }
}
