package org.yangxin.desginpattern.pattern.behavioral.observer;

/**
 * @author yangxin
 * 2020/03/31 21:45
 */
public class Test {

    public static void main(String[] args) {
        Course course = new Course("Java设计模式");
        Teacher teacher1 = new Teacher("A");
        Teacher teacher2 = new Teacher("B");
        course.addObserver(teacher1);
        course.addObserver(teacher2);

        // 业务逻辑代码
        Question question = new Question();
        question.setUserName("Geely");
        question.setQuestionContent("Java的主函数如何编写");

        course.produceQuestion(course, question);
    }
}
