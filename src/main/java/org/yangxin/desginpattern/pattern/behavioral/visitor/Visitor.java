package org.yangxin.desginpattern.pattern.behavioral.visitor;

/**
 * @author yangxin
 * 2020/04/08 21:00
 */
public class Visitor implements IVisitor {

    /**
     * 访问免费课程，打印所有免费课程名称
     */
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("免费课程：" + freeCourse);
    }

    /**
     * 访问实战课程，打印所有实战课程名称及价格
     */
    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("实战课程：" + codingCourse);
    }
}
