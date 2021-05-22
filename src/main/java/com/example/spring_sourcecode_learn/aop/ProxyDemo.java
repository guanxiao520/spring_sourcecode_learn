package com.example.spring_sourcecode_learn.aop;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.example.spring_sourcecode_learn.aop
 * @date 2021/5/23 3:45
 */
public class ProxyDemo {
    public static void main(String[] args) {
        Payment proxy = new AliPay(new RealPayment());
        proxy.pay();
    }
}