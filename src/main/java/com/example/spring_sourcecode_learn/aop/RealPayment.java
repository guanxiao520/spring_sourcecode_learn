package com.example.spring_sourcecode_learn.aop;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.example.spring_sourcecode_learn.aop
 * @date 2021/5/23 3:38
 */
public class RealPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("我只关心支付功能");
    }
}