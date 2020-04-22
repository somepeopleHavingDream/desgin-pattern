package org.yangxin.desginpattern.principle.demeter;

/**
 * @author yangxin
 * 2020/02/26 11:16
 */
public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader) {
        teamLeader.checkNumberOfCourses();
    }
}
