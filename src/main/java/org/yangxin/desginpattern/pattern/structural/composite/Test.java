package org.yangxin.desginpattern.pattern.structural.composite;

/**
 * @author yangxin
 * 2020/05/14 09:30
 */
public class Test {

    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux课程", 11.0);
        CatalogComponent windowsCourse = new Course("Windows课程", 11.0);

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录", 2);
        CatalogComponent mmallCourse1 = new Course("Java电商一期", 55.0);
        CatalogComponent mmallCourse2 = new Course("Java电商二期", 66.0);
        CatalogComponent designPattern = new Course("Java设计模式", 77.0);

        javaCourseCatalog.add(mmallCourse1);
        javaCourseCatalog.add(mmallCourse2);
        javaCourseCatalog.add(designPattern);

        CatalogComponent imoocMainCourseCatalog = new CourseCatalog("慕课网课程主目录", 1);
        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowsCourse);
        imoocMainCourseCatalog.add(javaCourseCatalog);

        imoocMainCourseCatalog.print();
    }
}
