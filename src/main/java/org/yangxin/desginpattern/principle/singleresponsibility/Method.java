package org.yangxin.desginpattern.principle.singleresponsibility;

/**
 * @author yangxin
 * 2020/02/26 10:50
 */
public class Method {
    private void updateUserInfo(String userName, String address) {
        userName = "geely";
        address = "beijing";
    }

    private void updateUserInfo(String userName, String... properties) {
        userName = "geely";
//        address = "beijing";
    }

    private void updateUsername(String userName) {
        userName = "geely";
    }

    private void updateUserAddress(String address) {
        address = "beijing";
    }

    /**
     * 尽量不写这种方法，尽量写符合单一职责的方法
     */
    private void updateUserInfo(String userName, String address, boolean bool) {
        if (bool) {
            // todo something1
        } else {
            // todo something2
        }

        userName = "geely";
        address = "beijing";
    }
}
