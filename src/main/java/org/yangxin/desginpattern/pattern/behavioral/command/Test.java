package org.yangxin.desginpattern.pattern.behavioral.command;

/**
 * @author yangxin
 * 2020/04/08 20:44
 */
public class Test {

    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("Java设计模式精讲");
        Command openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);
        Command closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);

        Staff staff = new Staff();
        staff.addCommand(openCourseVideoCommand);
        staff.addCommand(closeCourseVideoCommand);

        staff.executeCommands();
    }
}
