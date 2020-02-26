package org.yangxin.desginpattern.principle.singleresponsibility;

/**
 * @author yangxin
 * 2020/02/26 10:45
 */
public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();
}
