package org.yangxin.desginpattern.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * @author yangxin
 * 2020/03/23 19:50
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date birthDay = new Date(0L);
        Pig pig1 = new Pig("佩奇", birthDay);
        Pig pig2 = (Pig) pig1.clone();

        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getBirthDay().setTime(6666666666L);

        System.out.println(pig1);
        System.out.println(pig2);
    }
}
