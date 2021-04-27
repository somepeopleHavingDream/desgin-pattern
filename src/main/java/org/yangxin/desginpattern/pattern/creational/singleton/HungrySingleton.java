package org.yangxin.desginpattern.pattern.creational.singleton;

import java.io.Serializable;

class HungrySingleton implements Serializable {

    private final static HungrySingleton HUNGRY_SINGLETON;

    static {
        HUNGRY_SINGLETON = new HungrySingleton();
    }

    private HungrySingleton() {
        if (HUNGRY_SINGLETON != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }

    private Object readResolve() {
        return HUNGRY_SINGLETON;
    }
}
