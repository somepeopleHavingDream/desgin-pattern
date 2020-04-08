package org.yangxin.desginpattern.pattern.behavioral.command;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author yangxin
 * 2020/04/08 20:36
 */
@NoArgsConstructor
@AllArgsConstructor
public class CourseVideo {

    private String name;

    public void open() {
        System.out.println(name + "课程视频开放");
    }

    public void close() {
        System.out.println(name + "课程视频关闭");
    }
}
