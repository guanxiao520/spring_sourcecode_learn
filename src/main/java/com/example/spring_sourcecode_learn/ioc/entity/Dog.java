package com.example.spring_sourcecode_learn.ioc.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.example.spring_sourcecode_learn.ioc.entity
 * @date 2021/5/23 2:50
 */

@Component
@Primary
public class Dog implements Pet {
    @Override
    public void move() {
        System.out.println("running");
    }
}