package org.yangxin.desginpattern.pattern.structural.bridge;

/**
 * @author yangxin
 * 2020/03/21 22:01
 */
public class DepositAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
