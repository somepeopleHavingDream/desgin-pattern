package org.yangxin.desginpattern.pattern.creational.abstractfactory;

/**
 * @author yangxin
 * 2020/03/17 21:23
 */
public class PythonCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
