package org.kariya.dao.impl;

import lombok.extern.slf4j.Slf4j;
import org.kariya.dao.UserDao;

/**
 * @Description spring
 * @Author Kariya
 * @Date 2025/2/20 9:41
 */
@Slf4j
public class UserDaoImplForMysql implements UserDao {
    @Override
    public void delById() {
        log.info("Mysql正在删除用户信息...");
    }
}
