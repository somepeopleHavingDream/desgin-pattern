package org.yangxin.desginpattern.principle.dependenceinversion;

/**
 * @author yangxin
 * 2020/02/25 12:24
 */
public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely在学习Python课程。");
    }
}
