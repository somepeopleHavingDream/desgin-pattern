package org.yangxin.desginpattern.pattern.structural.adapter.objectadapter;


/**
 * @author yangxin
 * 2020/03/10 20:44
 */
public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }
}
