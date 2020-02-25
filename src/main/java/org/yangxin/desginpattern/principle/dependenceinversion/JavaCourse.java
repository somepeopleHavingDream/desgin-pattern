package org.yangxin.desginpattern.principle.dependenceinversion;

/**
 * @author yangxin
 * 2020/02/25 12:23
 */
public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely在学习Java课程。");
    }
}
