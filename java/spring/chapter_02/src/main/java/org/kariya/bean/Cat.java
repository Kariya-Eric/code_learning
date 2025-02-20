package org.kariya.bean;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description spring
 * @Author Kariya
 * @Date 2025/2/20 17:33
 */
@Slf4j
public class Cat {
    private String name;
    private int age;
    private String color;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
