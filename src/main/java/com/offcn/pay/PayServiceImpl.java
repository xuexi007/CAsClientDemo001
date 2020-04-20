package com.offcn.pay;

public class PayServiceImpl implements PayService {
    @Override
    public void pay(Double money) {
        //小李修改代码
        System.out.println("支付成功:"+money+"小李修改");

    }
}
