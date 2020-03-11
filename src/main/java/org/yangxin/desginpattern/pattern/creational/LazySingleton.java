package org.yangxin.desginpattern.pattern.creational;

/**
 * @author yangxin
 * 2020/03/11 20:32
 */
class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton() {

    }

    synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }

        return lazySingleton;
    }
}
