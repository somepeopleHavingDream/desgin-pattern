package org.yangxin.desginpattern.pattern.behavioral.state;

import lombok.Setter;

/**
 * @author yangxin
 * 2020/04/08 21:15
 */
@SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
@Setter
public abstract class CourseVideoState {

    protected CourseVideoContext courseVideoContext;

    public abstract void play();
    public abstract void speed();
    public abstract void pause();
    public abstract void stop();
}
