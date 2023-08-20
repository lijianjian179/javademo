package com.study.chapter3.part22.dao;

public class UserDaoJdbcImpl implements UserDao{

    @Override
    public int selectUserCount() {
        System.out.println("Jdbc查询用户数量");
        return 100;
    }
}
