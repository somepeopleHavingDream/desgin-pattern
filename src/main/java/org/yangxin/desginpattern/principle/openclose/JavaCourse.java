package org.yangxin.desginpattern.principle.openclose;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * @author yangxin
 * 2020/02/25 11:59
 */
@AllArgsConstructor
@ToString
public class JavaCourse implements ICourse {
    private Integer id;
    private String name;
    private Double price;

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }
}
