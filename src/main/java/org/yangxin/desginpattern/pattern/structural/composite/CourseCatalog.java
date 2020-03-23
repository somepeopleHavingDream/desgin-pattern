package org.yangxin.desginpattern.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangxin
 * 2020/03/23 20:54
 */
public class CourseCatalog extends CatalogComponent {

    private List<CatalogComponent> catalogComponentList = new ArrayList<>();
    private String name;

    public CourseCatalog(String name) {
        this.name = name;
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
        catalogComponentList.forEach(System.out::println);
    }
}
