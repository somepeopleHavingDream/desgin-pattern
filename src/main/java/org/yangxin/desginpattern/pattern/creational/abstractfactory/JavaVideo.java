package org.yangxin.desginpattern.pattern.creational.abstractfactory;

/**
 * @author yangxin
 * 2020/03/17 21:18
 */
public class JavaVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
