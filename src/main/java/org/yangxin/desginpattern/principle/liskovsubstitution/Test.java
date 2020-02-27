package org.yangxin.desginpattern.principle.liskovsubstitution;

/**
 * @author yangxin
 * 2020/02/27 12:23
 */
public class Test {
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() < rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("width:" + rectangle.getWidth() + " length:" + rectangle.getLength());
        }
        System.out.println("resize方法结束 width:" + rectangle.getWidth() + " length:" + rectangle.getLength());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);
    }
}
