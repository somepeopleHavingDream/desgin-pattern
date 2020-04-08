package org.yangxin.desginpattern.pattern.behavioral.state;

import lombok.Getter;

/**
 * @author yangxin
 * 2020/04/08 21:20
 */
@Getter
public class CourseVideoContext {

    private CourseVideoState courseVideoState;

    public static final PlayState PLAY_STATE = new PlayState();
    public static final StopState STOP_STATE = new StopState();
    public static final PauseState PAUSE_STATE = new PauseState();
    public static final SpeedState SPEED_STATE = new SpeedState();

    public void setCourseVideoState(CourseVideoState courseVideoState) {
        this.courseVideoState = courseVideoState;
        this.courseVideoState.setCourseVideoContext(this);
    }

    public void play() {
        courseVideoState.play();
    }

    public void speed() {
        courseVideoState.speed();
    }

    public void stop() {
        courseVideoState.stop();
    }

    public void pause() {
        courseVideoState.pause();
    }
}
