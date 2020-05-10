package org.yangxin.desginpattern.pattern.structural.decorator.v1;

/**
 * @author yangxin
 * 2020/03/09 20:53
 */
public class Test {

    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getDescription() + " " + batterCake.cost());

        BatterCake batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getDescription() + " " + batterCakeWithEgg.cost());

        BatterCake batterCakeWithEggSausage = new BatterCakeWithEggSausage();
        System.out.println(batterCakeWithEggSausage.getDescription() + " " + batterCakeWithEggSausage.cost());
    }
}
