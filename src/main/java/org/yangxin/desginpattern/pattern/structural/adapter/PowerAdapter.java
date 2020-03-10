package org.yangxin.desginpattern.pattern.structural.adapter;

/**
 * @author yangxin
 * 2020/03/10 21:01
 */
public class PowerAdapter implements DC5 {
    private AC220 ac220 = new AC220();

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();

        // 变压器
        return adapterInput / 44;
    }
}
