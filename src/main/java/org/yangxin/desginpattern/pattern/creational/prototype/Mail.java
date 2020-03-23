package org.yangxin.desginpattern.pattern.creational.prototype;

import lombok.Data;

/**
 * @author yangxin
 * 2020/03/23 19:26
 */
@Data
public class Mail implements Cloneable {

    private String name;
    private String emailAddress;
    private String content;

    public Mail() {
        System.out.println("Mail");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone mail object");
        return super.clone();
    }
}
