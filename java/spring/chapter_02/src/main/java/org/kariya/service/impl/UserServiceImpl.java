package org.kariya.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.kariya.dao.UserDao;
import org.kariya.service.UserService;

/**
 * @Description spring
 * @Author Kariya
 * @Date 2025/2/20 9:40
 */
@Slf4j
public class UserServiceImpl implements UserService {
    /*
     * 违背了OCP开闭原则，需要解耦合
     * */
    //private UserDao userDao = new UserDaoImplForMysql();
    
    /*
     * 不在程序中采用硬编码的方式来创建对象和维护对象关系，
     * IoC控制反转：将对象创建权和对象和对象的维护关系交出去
     * */
    private UserDao userDao;
    
    public void setUserDao(UserDao userDao) {
        log.info("setter方法被调用:{}", userDao);
        this.userDao = userDao;
    }
    
    @Override
    public void delById() {
        userDao.delById();
    }
}
