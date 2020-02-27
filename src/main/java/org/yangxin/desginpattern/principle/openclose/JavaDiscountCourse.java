package org.yangxin.desginpattern.principle.openclose;

/**
 * @author yangxin
 * 2020/02/25 12:09
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice() {
        return super.getPrice() * 0.8;
    }
}
