package org.yangxin.desginpattern.pattern.structural.adapter.objectadapter;

/**
 * @author yangxin
 * 2020/03/10 20:54
 */
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
