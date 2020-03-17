package org.yangxin.desginpattern.pattern.creational.factorymethod;

/**
 * @author yangxin
 * 2020/03/17 20:54
 */
public class PythonVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
