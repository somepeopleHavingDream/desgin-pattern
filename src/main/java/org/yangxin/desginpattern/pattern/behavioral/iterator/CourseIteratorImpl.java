package org.yangxin.desginpattern.pattern.behavioral.iterator;

import java.util.List;

/**
 * @author yangxin
 * 2020/03/23 21:19
 */
public class CourseIteratorImpl implements CourseIterator {

    private List<Course> courseList;
    private Integer position;
    private Course course;

    public CourseIteratorImpl(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public Course nextCourse() {
        System.out.println("返回课程，位置是：" + position);

        course = courseList.get(position);
        position++;

        return course;
    }

    @Override
    public boolean isLastCourse() {
        return position < courseList.size();
    }
}
