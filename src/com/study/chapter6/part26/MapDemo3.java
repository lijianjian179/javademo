package com.study.chapter6.part26;

import java.io.IOException;
import java.util.Properties;

/**
 * Properties
 */
public class MapDemo3 {

    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            // 相对路径：以编译后的项目的根目录为起点
            properties.load(MapDemo3.class.getClassLoader()
                    .getResourceAsStream("resources/db.properties"));
            System.out.println(properties.getProperty("username"));
            System.out.println(properties.getProperty("password"));
        } catch (IOException e) {
            throw new RuntimeException("加载资源文件失败", e);
        }
    }
}
