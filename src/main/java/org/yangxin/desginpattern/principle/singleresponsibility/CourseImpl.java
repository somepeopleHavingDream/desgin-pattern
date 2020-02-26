package org.yangxin.desginpattern.principle.singleresponsibility;

/**
 * @author yangxin
 * 2020/02/26 10:48
 */
public class CourseImpl implements ICourseManager, ICourseContent {
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
