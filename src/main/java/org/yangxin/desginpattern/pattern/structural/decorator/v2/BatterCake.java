package org.yangxin.desginpattern.pattern.structural.decorator.v2;

/**
 * @author yangxin
 * 2020/03/09 20:47
 */
public class BatterCake extends AbstractBatterCake {

    protected String getDescription() {
        return "煎饼";
    }

    protected int cost() {
        return 8;
    }
}
