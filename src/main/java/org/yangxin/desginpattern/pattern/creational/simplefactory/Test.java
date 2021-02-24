package org.yangxin.desginpattern.pattern.creational.simplefactory;

/**
 * @author yangxin
 * 2020/03/16 20:41
 */
@SuppressWarnings("AlibabaRemoveCommentedCode")
public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
//        Video video = videoFactory.getVideo("java");
//        Video video = new JavaVideo();
        video.produce();
    }
}
