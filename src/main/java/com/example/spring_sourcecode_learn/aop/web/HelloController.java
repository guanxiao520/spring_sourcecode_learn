package com.example.spring_sourcecode_learn.aop.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.example.spring_sourcecode_learn.aop.web
 * @date 2021/5/23 3:09
 */

@RestController
public class HelloController {

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    @ResponseBody
    public String Hello(){
        String sentence="hello world";
        System.out.println(sentence);
        return sentence;
    }
}