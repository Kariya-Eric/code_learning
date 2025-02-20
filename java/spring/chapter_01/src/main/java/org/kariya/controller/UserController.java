package org.kariya.controller;

import org.kariya.service.UserService;
import org.kariya.service.impl.UserServiceImpl;

/**
 * @Description spring
 * @Author Kariya
 * @Date 2025/2/20 9:40
 */
public class UserController {
    private UserService userService = new UserServiceImpl();
    
    public void delUserById() {
        userService.delById();
    }
}
