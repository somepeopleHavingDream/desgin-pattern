package org.yangxin.desginpattern.pattern.behavioral.command;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author yangxin
 * 2020/04/08 20:37
 */
@NoArgsConstructor
@AllArgsConstructor
public class OpenCourseVideoCommand implements Command {

    private CourseVideo courseVideo;

    @Override
    public void execute() {
        courseVideo.open();
    }
}
