package org.yangxin.desginpattern.pattern.creational.prototype.abstractprototype;

/**
 * @author yangxin
 * 2020/03/23 19:46
 */
public abstract class A implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
