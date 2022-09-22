package org.yangxin.desginpattern.pattern.behavioral.state;

/**
 * @author yangxin
 * 2020/04/08 21:27
 */
public class PauseState extends AbstractCourseVideoState {

    @Override
    public void play() {
        super.courseVideoStateContext.setCourseVideoState(CourseVideoStateContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        super.courseVideoStateContext.setCourseVideoState(CourseVideoStateContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        super.courseVideoStateContext.setCourseVideoState(CourseVideoStateContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        super.courseVideoStateContext.setCourseVideoState(CourseVideoStateContext.STOP_STATE);
    }
}
