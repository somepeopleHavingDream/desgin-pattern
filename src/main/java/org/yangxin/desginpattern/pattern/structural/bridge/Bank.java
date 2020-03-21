package org.yangxin.desginpattern.pattern.structural.bridge;

/**
 * @author yangxin
 * 2020/03/21 22:13
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}
