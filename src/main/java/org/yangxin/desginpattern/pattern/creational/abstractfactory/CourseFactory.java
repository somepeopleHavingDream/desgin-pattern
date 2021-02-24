package org.yangxin.desginpattern.pattern.creational.abstractfactory;

/**
 * @author yangxin
 * 2020/03/17 21:13
 */
@SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
public interface CourseFactory {

    Video getVideo();
    Article getArticle();
}
