package org.yangxin.desginpattern.pattern.creational.factorymethod;

/**
 * @author yangxin
 * 2020/03/17 20:53
 */
public class JavaVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
