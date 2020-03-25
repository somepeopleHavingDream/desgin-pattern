package org.yangxin.desginpattern.pattern.behavioral.interpreter;

/**
 * @author yangxin
 * 2020/03/25 20:37
 */
public class Test {

    public static void main(String[] args) {
        String inputStr = "6 100 11 + *";
        ExpressionParser expressionParser = new ExpressionParser();
        int result = expressionParser.parse(inputStr);
        System.out.println("解释器计算结果：" + result);
    }
}
