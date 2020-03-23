package org.yangxin.desginpattern.pattern.behavioral.iterator;

/**
 * @author yangxin
 * 2020/03/23 21:14
 */
public interface CourseAggregate {

    void addCourse(Course course);
    void removeCourse(Course course);

    CourseIterator getCourseIterator();
}
