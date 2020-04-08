package org.yangxin.desginpattern.pattern.behavioral.visitor;

/**
 * @author yangxin
 * 2020/04/08 20:53
 */
public class FreeCourse extends Course {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
