package org.yangxin.desginpattern.pattern.behavioral.interpreter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author yangxin
 * 2020/03/25 20:41
 */
@NoArgsConstructor
@AllArgsConstructor
public class MultiplyInterpreter implements Interpreter {

    private Interpreter firstExpression;
    private Interpreter secondExpression;

    @Override
    public int interpret() {
        return firstExpression.interpret() * secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "*";
    }
}
