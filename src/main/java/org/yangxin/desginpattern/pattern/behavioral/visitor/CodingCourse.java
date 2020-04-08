package org.yangxin.desginpattern.pattern.behavioral.visitor;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author yangxin
 * 2020/04/08 20:51
 */
@Getter
@Setter
@ToString
public class CodingCourse extends Course {

    private Integer price;

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
