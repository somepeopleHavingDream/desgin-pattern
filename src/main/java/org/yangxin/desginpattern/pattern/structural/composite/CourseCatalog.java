package org.yangxin.desginpattern.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 课程章节
 *
 * @author yangxin
 * 2020/03/23 20:54
 */
public class CourseCatalog extends CatalogComponent {

    private final List<CatalogComponent> catalogComponentList = new ArrayList<>();
    private final String name;
    private final Integer level;

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        catalogComponentList.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        catalogComponentList.remove(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent catalogComponent : catalogComponentList) {
            if (this.level != null) {
                for (int i = 0; i < this.level; i++) {
                    System.out.print(" ");
                }
            }
            catalogComponent.print();
        }
    }
}
