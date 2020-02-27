package org.yangxin.desginpattern.principle.liskovsubstitution;

import lombok.Data;

/**
 * @author yangxin
 * 2020/02/27 12:16
 */
public class Rectangle implements Quadrangle{
    private long length;
    private long width;

    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    @Override
    public long getWidth() {
        return width;
    }

    @Override
    public long getLength() {
        return length;
    }
}
