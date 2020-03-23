package org.yangxin.desginpattern.pattern.behavioral.iterator;

/**
 * @author yangxin
 * 2020/03/23 21:15
 */
public interface CourseIterator {

    Course nextCourse();
    boolean isLastCourse();
}
