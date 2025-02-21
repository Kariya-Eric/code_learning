package org.kariya.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.kariya.bean.Cat;
import org.kariya.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * @Description spring
 * @Author Kariya
 * @Date 2025/2/20 13:54
 */
@Slf4j
public class SpringTest {
    @Test
    public void demo01() {
        //应用上下文
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //默认情况下会调用类的无参构造方法反射创建对象
        Object user = context.getBean("user");
        log.info("spring容器id:{},name:{},displayname{},bean个数:{}", context.getId(), context.getApplicationName(), context.getDisplayName(), context.getBeanDefinitionCount());
        log.info("user bean:{}", user);
    }
    
    @Test
    public void demo02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = (UserService) context.getBean("userService");
        log.info("userService bean :{}", userService);
        userService.delById();
    }
    
    @Test
    public void demo03() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = (UserService) context.getBean("vipService");
        log.info("userService bean :{}", userService);
        userService.delById();
    }
    
    @Test
    public void demo04() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Cat cat = (Cat) context.getBean("cat");
        log.info("Cat bean :{}", cat);
    }
    
    @Test
    public void demo05() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        DataSource datasource = (DataSource) context.getBean("datasource");
        log.info("Datasource :{}", datasource);
    }
}
