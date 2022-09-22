package org.yangxin.desginpattern.pattern.behavioral.state;

/**
 * @author yangxin
 * 2020/04/08 21:27
 */
public class SpeedState extends AbstractCourseVideoState {

    @Override
    public void play() {
        super.courseVideoStateContext.setCourseVideoState(CourseVideoStateContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("快进播放课程视频状态");
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
