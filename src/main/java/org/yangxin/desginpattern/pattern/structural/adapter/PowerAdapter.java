package org.yangxin.desginpattern.pattern.structural.adapter;

/**
 * @author yangxin
 * 2020/03/10 21:01
 */
public class PowerAdapter implements Dc5 {

    private final AC220 ac220 = new AC220();

    @Override
    public int outputDc5v() {
        int adapterInput = ac220.outputAC220V();

        // 变压器
        return adapterInput / 44;
    }
}
