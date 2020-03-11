package org.yangxin.desginpattern.pattern.behavioral.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yangxin
 * 2020/03/11 20:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
class User {

    private String name;

    void sendMessage(String message) {
        StudyGroup.showMessage(this, message);
    }
}
