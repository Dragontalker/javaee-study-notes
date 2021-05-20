package com.dragontalker.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

    //Properties:  常用来处理配置文件, key和value都是String类型
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("jdbc.properties");
        props.load(fis); //加载流对应的文件

        String name = props.getProperty("name");
        String password = props.getProperty("password");

        System.out.println("name = " + name + ", password = " + password);
    }
}
