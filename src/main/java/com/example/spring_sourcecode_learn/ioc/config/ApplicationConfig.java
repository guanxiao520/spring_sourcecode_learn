package com.example.spring_sourcecode_learn.ioc.config;

import org.springframework.context.annotation.Configuration;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.example.spring_sourcecode_learn.ioc.config
 * @date 2021/5/23 2:36
 */


//打上configuration注解表示交由容器管理
@Configuration
public class ApplicationConfig {


    //打上bean标签,表示initPerson返回的对象将装配到IOC容器当中,name属性定义bean的名称,如果不配置默认bean名称就是initPerson
/*    @Bean(name = "person")
    public Person initPerson() {
        Person user = new Person();
        user.setId(1L);
        user.setName("Jack");
        return user;
    }*/
}