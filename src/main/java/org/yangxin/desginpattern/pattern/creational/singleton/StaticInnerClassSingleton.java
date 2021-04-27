package org.yangxin.desginpattern.pattern.creational.singleton;

/**
 * @author yangxin
 * 2020/03/11 21:11
 */
class StaticInnerClassSingleton {

    private static class InnerClass {

        @SuppressWarnings("InstantiationOfUtilityClass")
        private static final StaticInnerClassSingleton STATIC_INNER_CLASS_SINGLETON = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.STATIC_INNER_CLASS_SINGLETON;
    }
}
