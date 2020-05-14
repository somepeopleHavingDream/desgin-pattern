package org.yangxin.desginpattern.pattern.structural.composite;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 课程
 *
 * @author yangxin
 * 2020/03/23 20:50
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course extends CatalogComponent {

    private String name;
    private Double price;

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public Double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
