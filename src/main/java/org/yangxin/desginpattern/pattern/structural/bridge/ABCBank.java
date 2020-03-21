package org.yangxin.desginpattern.pattern.structural.bridge;

/**
 * @author yangxin
 * 2020/03/21 22:16
 */
public class ABCBank extends Bank {

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return account;
    }
}
