package org.yangxin.desginpattern.pattern.creational.builder.v2;

/**
 * @author yangxin
 * 2020/03/22 21:04
 */
public class Test {

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder()
                .buildCourseName("Java设计模式")
                .buildCourseVideo("Java设计模式视频")
                .build();
        System.out.println(course);
    }
}
