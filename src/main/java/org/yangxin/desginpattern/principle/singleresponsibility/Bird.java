package org.yangxin.desginpattern.principle.singleresponsibility;

import java.util.Objects;

/**
 * @author yangxin
 * 2020/02/26 10:37
 */
public class Bird {
    public void mainMoveMode(String birdName) {
        if (Objects.equals("鸵鸟", birdName)) {
            System.out.println(birdName + "用脚走");
            return;
        }
        System.out.println(birdName + "用翅膀飞");
    }
}
