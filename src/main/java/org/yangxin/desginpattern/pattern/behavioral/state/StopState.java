package org.yangxin.desginpattern.pattern.behavioral.state;

/**
 * @author yangxin
 * 2020/04/08 21:27
 */
public class StopState extends AbstractCourseVideoState {

    @Override
    public void play() {
        super.courseVideoStateContext.setCourseVideoState(CourseVideoStateContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("ERROR 停止状态不能快进!!");
    }

    @Override
    public void pause() {
        System.out.println("ERROR 停止状态不能暂停!!");
    }

    @Override
    public void stop() {
        System.out.println("停止播放课程视频状态");
    }
}
