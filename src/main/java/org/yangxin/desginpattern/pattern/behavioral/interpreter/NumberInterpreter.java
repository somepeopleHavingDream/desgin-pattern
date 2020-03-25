package org.yangxin.desginpattern.pattern.behavioral.interpreter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author yangxin
 * 2020/03/25 20:45
 */
@NoArgsConstructor
@AllArgsConstructor
public class NumberInterpreter implements Interpreter {

    private Integer number;

    public NumberInterpreter(String number) {
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpret() {
        return this.number;
    }
}
