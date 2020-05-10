package org.yangxin.desginpattern.pattern.structural.decorator.v2;

/**
 * @author yangxin
 * 2020/03/09 21:00
 */
public class AbstractDecorator extends AbstractBatterCake {

    private final AbstractBatterCake abstractBatterCake;

    AbstractDecorator(AbstractBatterCake abstractBatterCake) {
        this.abstractBatterCake = abstractBatterCake;
    }

    @Override
    protected String getDescription() {
        return this.abstractBatterCake.getDescription();
    }

    @Override
    protected int cost() {
        return this.abstractBatterCake.cost();
    }
}
