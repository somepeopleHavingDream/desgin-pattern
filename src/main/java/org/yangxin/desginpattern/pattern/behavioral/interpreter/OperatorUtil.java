package org.yangxin.desginpattern.pattern.behavioral.interpreter;

/**
 * @author yangxin
 * 2020/03/25 20:54
 */
public class OperatorUtil {

    public static boolean isOperator(String symbol) {
        return "+".equals(symbol) || "*".equals(symbol);
    }

    public static Interpreter getExpressionObject(Interpreter firstExpression,
                                                  Interpreter secondExpression,
                                                  String symbol) {
        if ("+".equals(symbol)) {
            return new AddInterpreter(firstExpression, secondExpression);
        } else if ("*".equals(symbol)) {
            return new MultiplyInterpreter(firstExpression, secondExpression);
        }

        return null;
    }
}
