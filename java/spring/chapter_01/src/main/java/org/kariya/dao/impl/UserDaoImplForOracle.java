package org.kariya.dao.impl;

import org.kariya.dao.UserDao;

/**
 * @Description spring
 * @Author Kariya
 * @Date 2025/2/20 9:49
 */
public class UserDaoImplForOracle implements UserDao {
    @Override
    public void delById() {
        System.out.println("Oracle正在删除用户信息...");
    }
}
