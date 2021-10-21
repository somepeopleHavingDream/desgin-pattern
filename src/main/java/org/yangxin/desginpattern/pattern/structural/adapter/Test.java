package org.yangxin.desginpattern.pattern.structural.adapter;

/**
 * @author yangxin
 * 2020/03/10 21:03
 */
public class Test {

    public static void main(String[] args) {
        // dc是直流电，ac是交流电
        Dc5 dc5 = new PowerAdapter();
        System.out.println(dc5.outputDc5v());
    }
}
