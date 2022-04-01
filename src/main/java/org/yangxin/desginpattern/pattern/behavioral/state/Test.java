package org.yangxin.desginpattern.pattern.behavioral.state;

/**
 * @author yangxin
 * 2020/04/08 21:39
 */
public class Test {

    public static void main(String[] args) {
        CourseVideoStateContext courseVideoStateContext = new CourseVideoStateContext();
        courseVideoStateContext.setCourseVideoState(new PlayState());

        System.out.println("当前状态:" + courseVideoStateContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoStateContext.pause();
        System.out.println("当前状态:" + courseVideoStateContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoStateContext.speed();
        System.out.println("当前状态:" + courseVideoStateContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoStateContext.stop();
        System.out.println("当前状态:" + courseVideoStateContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoStateContext.speed();
        System.out.println("当前状态:" + courseVideoStateContext.getCourseVideoState().getClass().getSimpleName());
    }
}
