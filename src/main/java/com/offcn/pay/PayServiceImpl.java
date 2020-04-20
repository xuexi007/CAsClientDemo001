package com.offcn.pay;

public class PayServiceImpl implements PayService {
    @Override
    public void pay(Double money) {
        for (int i = 0; i <10 ; i++) {
            //小李+小王修改修改代码
            System.out.println("支付成功:"+money+"小李修改"+i);
        }




    }
}
