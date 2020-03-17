package org.yangxin.desginpattern.pattern.creational.factorymethod;

/**
 * @author yangxin
 * 2020/03/16 20:38
 */
public class JavaVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
