package com.example.spring_sourcecode_learn.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.example.spring_sourcecode_learn.aop
 * @date 2021/5/23 3:14
 */
//aspect代表将java类定义为切面类
@Aspect
@Component
public class RequestLogAspect {

    private static final Logger logger= LoggerFactory.getLogger(RequestLogAspect.class);
    @Pointcut("execution (public * com.example.spring_sourcecode_learn.aop.web..*.*(..))")
    public void webLog(){

    }

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        logger.info("URL : "+request.getRequestURI().toString());
        logger.info("IP : "+request.getRemoteAddr());
    }

    //ret 代表HelloController返回
    @AfterReturning(returning = "ret",pointcut = "webLog()")
    public void doAfterReturning(Object ret){
        logger.info("RESPONSE : "+ret);
    }
}