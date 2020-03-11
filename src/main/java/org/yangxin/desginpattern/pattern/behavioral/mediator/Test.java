package org.yangxin.desginpattern.pattern.behavioral.mediator;

/**
 * @author yangxin
 * 2020/03/11 20:21
 */
public class Test {

    public static void main(String[] args) {
        User alice = new User("alice");
        User tom = new User("tom");

        alice.sendMessage("alice");
        tom.sendMessage("tom");
    }
}
