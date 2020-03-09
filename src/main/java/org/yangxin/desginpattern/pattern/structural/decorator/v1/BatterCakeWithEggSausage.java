package org.yangxin.desginpattern.pattern.structural.decorator.v1;

/**
 * @author yangxin
 * 2020/03/09 20:51
 */
public class BatterCakeWithEggSausage extends BatterCakeWithEgg {

    @Override
    public String getDescription() {
        return super.getDescription() + " 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
