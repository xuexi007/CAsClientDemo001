package com.offcn.pay;

public class PayServiceImpl implements PayService {
    /**
     * 小王修改代码，增加for循环
     * @param money
     */
    @Override
    public void pay(Double money) {
        for (int i = 0; i <10 ; i++) {
            System.out.println("支付成功:"+money+i);
        }


    }
}
