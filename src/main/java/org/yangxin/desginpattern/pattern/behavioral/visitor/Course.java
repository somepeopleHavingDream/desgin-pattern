package org.yangxin.desginpattern.pattern.behavioral.visitor;

import lombok.Data;

/**
 * @author yangxin
 * 2020/04/08 20:51
 */
@Data
public abstract class Course {

    private String name;

    public abstract void accept(IVisitor visitor);
}
