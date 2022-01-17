package org.yangxin.desginpattern.pattern.creational.simplefactory;

/**
 * @author yangxin
 * 2020/03/16 20:39
 */
public class PythonVideo extends AbstractVideo {

    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
