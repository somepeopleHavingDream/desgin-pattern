package org.yangxin.desginpattern.pattern.structural.adapter.objectadapter;


/**
 * @author yangxin
 * 2020/03/10 20:47
 */
public class Test {

    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
