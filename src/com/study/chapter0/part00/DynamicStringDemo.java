package com.study.chapter0.part00;

import java.util.Scanner;

/**
 * 将一个由英文字母组成的字符串转换成从末尾开始每三个字母用逗号分隔的形式
 * 输入：hellonowcoder
 * 输出：h,ell,ono,wco,der
 */
public class DynamicStringDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        //write your code here......
//        char[] charArr = str.toCharArray();
//        int index = charArr.length - 1;
//        StringBuilder sb = new StringBuilder();
//        for (int i = charArr.length - 1; i >= 0; i--) {
//            sb.append(charArr[i]);
//            if ((i + 2) % 3 == 0) {
//                sb.append(',');
//            }
//        }
//        System.out.println(sb.reverse().toString());
        StringBuilder sb = new StringBuilder(str);
        for (int i = str.length(); i >= 0; i-=3) {
            sb.insert(i, ',');
        }
        System.out.println(sb.toString());
        scanner.close();
    }
}
