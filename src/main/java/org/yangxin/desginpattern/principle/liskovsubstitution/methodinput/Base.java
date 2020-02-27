package org.yangxin.desginpattern.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * @author yangxin
 * 2020/02/27 12:48
 */
public class Base {
    public void method(HashMap map) {
        System.out.println("父类被执行");
    }
}
