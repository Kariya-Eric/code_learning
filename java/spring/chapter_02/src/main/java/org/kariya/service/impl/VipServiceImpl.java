package org.kariya.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.kariya.dao.UserDao;
import org.kariya.service.UserService;

/**
 * @Description spring
 * @Author Kariya
 * @Date 2025/2/20 17:14
 */
@Slf4j
public class VipServiceImpl implements UserService {
    private UserDao userDao;
    
    public VipServiceImpl(UserDao userDao) {
        log.info("有参构造方法执行中...");
        this.userDao = userDao;
    }
    
    @Override
    public void delById() {
        userDao.delById();
    }
}
