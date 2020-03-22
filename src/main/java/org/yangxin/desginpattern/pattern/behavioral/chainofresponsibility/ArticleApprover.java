package org.yangxin.desginpattern.pattern.behavioral.chainofresponsibility;

import org.springframework.util.StringUtils;

/**
 * @author yangxin
 * 2020/03/22 14:56
 */
public class ArticleApprover extends Approver {

    @Override
    public void deploy(Course course) {
        if (StringUtils.isEmpty(course.getArticle())) {
            System.out.println(course.getName() + "不含有手记，不批准");
            return;
        }

        System.out.println(course.getName() + "含有手记，批准");
        if (approver != null) {
            approver.deploy(course);
        }
    }
}
