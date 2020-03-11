package org.yangxin.desginpattern.pattern.creational;

/**
 * @author yangxin
 * 2020/03/11 20:32
 */
class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazySingleton;

    private LazyDoubleCheckSingleton() {

    }

    static LazyDoubleCheckSingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazyDoubleCheckSingleton();

                    // 1.分配内存给这个对象
                    // 3.设置lazySingleton指向刚分配的对象
                    // 2.初始化对象
                    // intra-thread semantics
                }
            }
        }

        return lazySingleton;
    }
}
