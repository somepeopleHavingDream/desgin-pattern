package org.yangxin.desginpattern.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangxin
 * 2020/02/26 11:17
 */
public class TeamLeader {
    public void checkNumberOfCourses() {
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }

        System.out.println("在线课程的数量是：" + courseList.size());
    }
}
