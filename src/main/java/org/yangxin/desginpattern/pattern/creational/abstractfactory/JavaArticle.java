package org.yangxin.desginpattern.pattern.creational.abstractfactory;

/**
 * @author yangxin
 * 2020/03/17 21:19
 */
public class JavaArticle extends Article {

    @Override
    public void produce() {
        System.out.println("编写Java课程手记");
    }
}
