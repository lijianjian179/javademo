package com.study.chapter3.part22;

import com.study.chapter3.part22.dao.DaoFactory;
import com.study.chapter3.part22.dao.UserDao;
import com.study.chapter3.part22.util.ArrayUtil;
import com.study.chapter3.part22.util.Comparator;

import java.util.Arrays;

/**
 * 面向接口编程
 */
public class InterfaceDemo implements Constant{

    public static void main(String[] args) {
        System.out.println(WIDTH + "*" + HEIGHT);

        UserDao dao = DaoFactory.getUserDao();
        System.out.println(dao.selectUserCount());

        int[] nums = {10, 4, 13, 1, 8};
        ArrayUtil.sort(nums, new ComparatorImpl());
        System.out.println(Arrays.toString(nums));
    }
}

// 牌面比较规则
class ComparatorImpl implements Comparator {

    @Override
    public int compare(int m, int n) {
        if (m == n) {
            return 0;
        } else if (m == 1) {
            return 1;
        } else if (n == 1) {
            return -1;
        } else {
            return m > n ? 1 : -1;
        }
    }
}
