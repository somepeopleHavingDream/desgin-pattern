package org.yangxin.desginpattern.pattern.behavioral.interpreter;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

/**
 * @author yangxin
 * 2020/03/25 20:38
 */
public class ExpressionParser {

    private Deque<Interpreter> stack = new LinkedList<>();

    public int parse(String str) {
        String[] strItemArray = str.split(" ");
        for (String symbol : strItemArray) {
            if (!OperatorUtil.isOperator(symbol)) {
                Interpreter numberExpression = new NumberInterpreter(symbol);
                stack.push(numberExpression);
                System.out.println(String.format("入栈： %d", numberExpression.interpret()));
            } else {
                // 是运算符号，可以计算
                Interpreter firstExpression = stack.pop();
                Interpreter secondExpression = stack.pop();
                System.out.println(String.format("出栈： %d和%d", firstExpression.interpret(),
                        secondExpression.interpret()));

                Interpreter operator = OperatorUtil.getExpressionObject(firstExpression, secondExpression, symbol);
                System.out.println(String.format("应用运算符： %s", operator));
                int result = Objects.requireNonNull(operator).interpret();
                Interpreter resultExpression = new NumberInterpreter(result);
                stack.push(resultExpression);
                System.out.println(String.format("阶段结果入栈： %d", resultExpression.interpret()));
            }
        }

        return stack.pop().interpret();
    }
}
