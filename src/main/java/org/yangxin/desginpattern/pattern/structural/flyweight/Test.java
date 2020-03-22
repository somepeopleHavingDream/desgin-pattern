package org.yangxin.desginpattern.pattern.structural.flyweight;

/**
 * @author yangxin
 * 2020/03/22 21:36
 */
public class Test {

    private static final String[] departments = {"RD", "QA", "PM", "BD"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
