package org.yangxin.desginpattern.pattern.behavioral.state;

/**
 * @author yangxin
 * 2020/04/08 21:27
 */
public class PlayState extends CourseVideoState {

    @Override
    public void play() {
        System.out.println("正常播放课程视频状态");
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
