package org.kariya.dao.impl;

import org.kariya.dao.UserDao;

/**
 * @Description spring
 * @Author Kariya
 * @Date 2025/2/20 9:41
 */
public class UserDaoImplForMysql implements UserDao {
    @Override
    public void delById() {
        System.out.println("Mysql正在删除用户信息...");
    }
}
