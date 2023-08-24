package com.study.chapter6.part28;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * File
 */
public class IODemo1 {

    public static void main(String[] args) throws IOException {
        File file = null;

        // 创建
        file = new File("C:/work/alpha/1.txt");
        file.createNewFile();

        // 删除
//        file.delete();

        // 改名
//        file.renameTo(new File("C:/work/alpha/2.txt"));

        // 判断
        System.out.println("是否存在：" + file.exists());
        System.out.println("是否文件：" + file.isFile());
        System.out.println("是否可读：" + file.canRead());
        System.out.println("是否可写：" + file.canWrite());
        System.out.println("是否绝对：" + file.isAbsolute());

        // 访问
        System.out.println("文件名称：" + file.getName());
        System.out.println("文件路径：" + file.getPath());
        System.out.println("绝对路径：" + file.getAbsolutePath());
        System.out.println("上级目录：" + file.getParent());
        System.out.println("文件长度：" + file.length());

        // 目录操作
        file = new File("C:/work/alpha/a");
        file.mkdir();
        System.out.println(Arrays.toString(file.listFiles()));

        // 相对路径
        file = new File("abc.txt");
        file.createNewFile();

        System.out.println("文件路径：" + file.getPath());
        System.out.println("绝对路径：" + file.getAbsolutePath());
        System.out.println("上级目录：" + file.getParent());
        System.out.println("上级目录：" + file.getAbsoluteFile().getParent());
    }
}
