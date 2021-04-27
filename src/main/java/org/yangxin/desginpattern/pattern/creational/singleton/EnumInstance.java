package org.yangxin.desginpattern.pattern.creational.singleton;

/**
 * @author yangxin
 * 2020/03/12 20:31
 */
public enum EnumInstance {

    /**
     * 单例实例
     */
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
