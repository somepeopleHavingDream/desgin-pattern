package org.yangxin.desginpattern.pattern.creational.singleton;

/**
 * @author yangxin
 * 2020/03/11 20:36
 */
public class T implements Runnable {

    @Override
    public void run() {
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + instance);
    }
}
