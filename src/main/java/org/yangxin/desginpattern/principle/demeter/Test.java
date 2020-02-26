package org.yangxin.desginpattern.principle.demeter;

/**
 * @author yangxin
 * 2020/02/26 11:21
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
