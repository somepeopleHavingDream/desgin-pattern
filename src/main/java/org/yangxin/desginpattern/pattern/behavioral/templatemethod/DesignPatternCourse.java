package org.yangxin.desginpattern.pattern.behavioral.templatemethod;

/**
 * @author yangxin
 * 2020/03/24 20:50
 */
public class DesignPatternCourse extends AbstractCourse {

    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
