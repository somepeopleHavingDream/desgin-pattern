package org.yangxin.desginpattern.pattern.structural.adapter;

/**
 * @author yangxin
 * 2020/03/10 21:03
 */
public class Test {

    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        System.out.println(dc5.outputDC5V());
    }
}
