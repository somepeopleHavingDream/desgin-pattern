package org.yangxin.desginpattern.pattern.structural.bridge;

/**
 * @author yangxin
 * 2020/03/21 22:22
 */
public class Test {

    public static void main(String[] args) {
        ICBCBank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        ABCBank abcBank = new ABCBank(new SavingAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();
    }
}
