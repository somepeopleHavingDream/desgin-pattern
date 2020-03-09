package org.yangxin.desginpattern.pattern.structural.decorator.v2;

/**
 * @author yangxin
 * 2020/03/09 21:09
 */
public class Test {

    public static void main(String[] args) {
        AbstractBatterCake batterCake = new BatterCake();
        batterCake = new EggDecorator(batterCake);
        batterCake = new EggDecorator(batterCake);
        batterCake = new SausageDecorator(batterCake);
        System.out.println(batterCake.getDescription() + " " + batterCake.cost());
    }
}
