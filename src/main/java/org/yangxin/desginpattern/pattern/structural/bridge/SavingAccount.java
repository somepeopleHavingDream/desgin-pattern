package org.yangxin.desginpattern.pattern.structural.bridge;

/**
 * @author yangxin
 * 2020/03/21 22:09
 */
public class SavingAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
