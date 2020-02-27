package org.yangxin.desginpattern.principle.liskovsubstitution.methodinput;

import java.util.Map;

/**
 * @author yangxin
 * 2020/02/27 12:49
 */
public class Child extends Base {
//    @Override
//    public void method(HashMap map) {
//        System.out.println("子类HashMap入参方法被执行");
//    }

    public void method(Map map) {
        System.out.println("子类Map入参方法被执行");
    }
}
