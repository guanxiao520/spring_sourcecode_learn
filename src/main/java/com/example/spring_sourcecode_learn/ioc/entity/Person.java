package com.example.spring_sourcecode_learn.ioc.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.example.spring_sourcecode_learn.ioc.entity
 * @date 2021/5/23 2:35
 */

@Component
public class Person {

    @Value("1")
    private Long id;
    @Value("Jack")
    private String name;

    @Autowired
    private Pet pet;

    public void call() {
        pet.move();
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}