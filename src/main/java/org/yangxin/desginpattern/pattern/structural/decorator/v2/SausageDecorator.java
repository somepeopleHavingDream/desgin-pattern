package org.yangxin.desginpattern.pattern.structural.decorator.v2;

/**
 * @author yangxin
 * 2020/03/09 21:02
 */
public class SausageDecorator extends AbstractDecorator {

    public SausageDecorator(AbstractBatterCake abstractBatterCake) {
        super(abstractBatterCake);
    }

    @Override
    protected String getDescription() {
        return super.getDescription() + " 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
