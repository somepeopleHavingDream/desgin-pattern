package org.yangxin.desginpattern.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * @author yangxin
 * 2020/02/27 12:51
 */
public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        HashMap hashMap = new HashMap<>();
        child.method(hashMap);
    }
}
