package org.yangxin.desginpattern.pattern.behavioral.visitor;

/**
 * @author yangxin
 * 2020/04/08 20:52
 */
public interface IVisitor {

    void visit(FreeCourse freeCourse);

    void visit(CodingCourse codingCourse);
}
