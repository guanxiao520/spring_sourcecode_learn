package com.example.spring_sourcecode_learn;

import com.example.spring_sourcecode_learn.ioc.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringSourcecodeLearnApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringSourcecodeLearnApplication.class, args);
        Person person = ctx.getBean(Person.class);
        //name is Jack 可以看到控制台获取到刚刚注入到容器当中的bean
        System.out.println("name is "+person.getName());
        person.call();
    }

}
