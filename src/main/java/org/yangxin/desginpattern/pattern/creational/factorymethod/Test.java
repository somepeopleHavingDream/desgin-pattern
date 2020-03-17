package org.yangxin.desginpattern.pattern.creational.factorymethod;

/**
 * @author yangxin
 * 2020/03/16 20:41
 */
public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
