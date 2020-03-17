package org.yangxin.desginpattern.pattern.creational.abstractfactory;

/**
 * @author yangxin
 * 2020/03/17 21:21
 */
public class PythonArticle extends Article {

    @Override
    public void produce() {
        System.out.println("编写Python手记");
    }
}
