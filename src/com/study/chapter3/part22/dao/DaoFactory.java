package com.study.chapter3.part22.dao;

/**
 * 工厂模式
 */
public class DaoFactory {

    public static UserDao getUserDao() {
        return new UserDaoJdbcImpl();
    }
}
