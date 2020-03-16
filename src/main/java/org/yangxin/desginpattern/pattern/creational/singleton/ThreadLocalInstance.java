package org.yangxin.desginpattern.pattern.creational.singleton;

/**
 * @author yangxin
 * 2020/03/16 20:24
 */
public class ThreadLocalInstance {

    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstanceThreadLocal
            = ThreadLocal.withInitial(ThreadLocalInstance::new);

    private ThreadLocalInstance() {}

    public static ThreadLocalInstance getInstance() {
        return threadLocalInstanceThreadLocal.get();
    }
}
