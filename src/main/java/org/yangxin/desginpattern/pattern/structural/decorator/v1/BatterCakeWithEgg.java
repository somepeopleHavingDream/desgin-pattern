package org.yangxin.desginpattern.pattern.structural.decorator.v1;

/**
 * @author yangxin
 * 2020/03/09 20:49
 */
public class BatterCakeWithEgg extends BatterCake {

    @Override
    public String getDescription() {
        return super.getDescription() + " 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
