package org.yangxin.desginpattern.pattern.creational.abstractfactory;

/**
 * @author yangxin
 * 2020/03/17 21:20
 */
public class PythonVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
