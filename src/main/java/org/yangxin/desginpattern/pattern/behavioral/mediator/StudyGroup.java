package org.yangxin.desginpattern.pattern.behavioral.mediator;

import java.util.Date;

/**
 * @author yangxin
 * 2020/03/11 20:17
 */
class StudyGroup {

    static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " " + user + " " + message);
    }
}
