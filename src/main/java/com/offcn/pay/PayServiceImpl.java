package com.offcn.pay;

public class PayServiceImpl implements PayService {
    @Override
    public void pay(Double money) {
        System.out.println("支付成功:"+money);
    }
}
