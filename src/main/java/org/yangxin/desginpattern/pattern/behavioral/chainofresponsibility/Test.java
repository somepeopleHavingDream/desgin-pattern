package org.yangxin.desginpattern.pattern.behavioral.chainofresponsibility;

/**
 * @author yangxin
 * 2020/03/22 15:01
 */
@SuppressWarnings("AlibabaRemoveCommentedCode")
public class Test {

    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("Java设计模式精讲");
        course.setArticle("Java设计模式精讲的手记");
//        course.setVideo("Java设计模式精讲的视频");

        articleApprover.setNextApprover(videoApprover);

        articleApprover.deploy(course);
    }
}