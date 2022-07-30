package org.yangxin.desginpattern.pattern.structural.decorator.v2;

/**
 * @author yangxin
 * 2020/03/09 20:57
 */
@SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
public abstract class AbstractBatterCake {

    protected abstract String getDescription();
    protected abstract int cost();
}
