package org.yangxin.desginpattern.pattern.creational.prototype.clone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author yangxin
 * 2020/03/23 19:48
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pig implements Cloneable {

    private String name;
    private Date birthDay;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();

        // 深克隆
        pig.birthDay = (Date) pig.birthDay.clone();
        return pig;
    }
}
