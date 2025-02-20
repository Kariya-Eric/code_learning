package org.kariya.test;

import org.kariya.controller.UserController;

/**
 * @Description spring
 * @Author Kariya
 * @Date 2025/2/20 9:45
 */
public class Test {
    public static void main(String[] args) {
        UserController controller = new UserController();
        controller.delUserById();
    }
}
