package org.yangxin.desginpattern.pattern.behavioral.observer;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Observable;
import java.util.Observer;

/**
 * @author yangxin
 * 2020/03/31 21:35
 */
@NoArgsConstructor
@AllArgsConstructor
public class Teacher implements Observer {

    private String teacherName;

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println("收到推送");
        System.out.println(course + " " + question);
    }
}
