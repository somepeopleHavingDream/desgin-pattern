package org.yangxin.desginpattern.pattern.behavioral.templatemethod;

/**
 * @author yangxin
 * 2020/03/24 20:52
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("后端设计模式课程start");
        AbstractCourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("后端设计模式课程end");

        System.out.println("前端课程start");
        AbstractCourse feCourse = new FECourse(true);
        feCourse.makeCourse();
        System.out.println("前端课程end");
    }
}
