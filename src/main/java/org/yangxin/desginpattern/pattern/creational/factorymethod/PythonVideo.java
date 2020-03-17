package org.yangxin.desginpattern.pattern.creational.factorymethod;

/**
 * @author yangxin
 * 2020/03/16 20:39
 */
public class PythonVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
