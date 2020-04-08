package org.yangxin.desginpattern.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangxin
 * 2020/04/08 20:56
 */
public class Test {

    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<>();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("SpringMVC数据绑定");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("Java设计模式精讲");
        codingCourse.setPrice(299);

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        courseList.forEach(e -> e.accept(new Visitor()));
    }
}
