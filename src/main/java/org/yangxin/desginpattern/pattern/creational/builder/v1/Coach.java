package org.yangxin.desginpattern.pattern.creational.builder.v1;

import lombok.Data;

/**
 * @author yangxin
 * 2020/03/22 20:44
 */
@Data
public class Coach {

    private CourseBuilder courseBuilder;

    public Course makeCourse(String courseName,
                             String coursePPT,
                             String courseVideo,
                             String courseArticle,
                             String courseQA) {
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildCoursePPT(coursePPT);
        this.courseBuilder.buildCourseVideo(courseVideo);
        this.courseBuilder.buildCourseArticle(courseArticle);
        this.courseBuilder.buildCourseQA(courseQA);

        return this.courseBuilder.makeCourse();
    }
}
