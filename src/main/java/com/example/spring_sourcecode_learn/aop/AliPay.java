package com.example.spring_sourcecode_learn.aop;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.example.spring_sourcecode_learn.aop
 * @date 2021/5/23 3:39
 */
public class AliPay implements Payment {

    private Payment payment;

    public AliPay(Payment payment) {
        this.payment = payment;
    }

    private void beforePay() {
        System.out.println("从招行取款");
    }

    @Override
    public void pay() {
        beforePay();
        payment.pay();
        afterPay();
    }

    private void afterPay() {
        System.out.println("支付给某店家");
    }
}