package org.yangxin.desginpattern.pattern.creational.builder.v1;

/**
 * @author yangxin
 * 2020/03/22 20:48
 */
public class Test {

    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("Java设计模式",
                "Java设计模式精讲PPT",
                "Java设计模式精讲视频",
                "Java设计模式精讲手记",
                "Java设计模式精讲问答");
        System.out.println(course);
    }
}
