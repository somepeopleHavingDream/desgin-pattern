package org.yangxin.desginpattern.pattern.behavioral.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Observable;

/**
 * @author yangxin
 * 2020/03/31 21:33
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class Course extends Observable {

    private String courseName;

    public void produceQuestion(Course course, Question question) {
        System.out.println(question + " " + course);
        setChanged();
        notifyObservers(question);
    }
}
