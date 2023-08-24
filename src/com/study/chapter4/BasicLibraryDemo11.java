package com.study.chapter4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Pattern和Matcher类
 *
 * @see java.util.regex.Pattern
 * @see java.util.regex.Matcher
 */
public class BasicLibraryDemo11 {

    public static void main(String[] args) {
        // Pattern
        System.out.println(Pattern.matches("^\\w{6,20}$", "nowcoder_2020#"));

        // Pattern实例方法
        Pattern pattern = Pattern.compile("^\\w{6,20}$");
        Matcher matcher = pattern.matcher("nowcoder_2023");
        System.out.println(matcher.matches());

        // Matcher的方法
        String str = "高价回收二手电脑，电话：13812345678,18612345678,18612345678,联系人诸葛先生";
        String reg = "(13[0-9]|14[5|7]|15[0|1|2|3|4|5|6|7|8|9]|18[0|1|2|3|4|5|6|7|8|9])\\d{8}";
        Matcher matcher1 = Pattern.compile(reg).matcher(str);
        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }
    }
}
