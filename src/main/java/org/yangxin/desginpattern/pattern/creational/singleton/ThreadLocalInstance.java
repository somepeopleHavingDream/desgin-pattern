package org.yangxin.desginpattern.pattern.creational.singleton;

/**
 * @author yangxin
 * 2020/03/16 20:24
 */
public class ThreadLocalInstance {

    private static final ThreadLocal<ThreadLocalInstance> THREAD_LOCAL_INSTANCE_THREAD_LOCAL
            = ThreadLocal.withInitial(ThreadLocalInstance::new);

    private ThreadLocalInstance() {}

    public static ThreadLocalInstance getInstance() {
        return THREAD_LOCAL_INSTANCE_THREAD_LOCAL.get();
    }
}
