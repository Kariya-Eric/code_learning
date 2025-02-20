package org.kariya.dao.impl;

import lombok.extern.slf4j.Slf4j;
import org.kariya.dao.UserDao;

/**
 * @Description spring
 * @Author Kariya
 * @Date 2025/2/20 9:49
 */
@Slf4j
public class UserDaoImplForOracle implements UserDao {
    @Override
    public void delById() {
        log.info("Oracle正在删除用户信息...");
    }
}
