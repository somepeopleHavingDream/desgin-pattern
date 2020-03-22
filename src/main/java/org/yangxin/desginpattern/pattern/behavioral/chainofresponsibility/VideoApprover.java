package org.yangxin.desginpattern.pattern.behavioral.chainofresponsibility;

import org.springframework.util.StringUtils;

/**
 * @author yangxin
 * 2020/03/22 14:56
 */
public class VideoApprover extends Approver {

    @Override
    public void deploy(Course course) {
        if (StringUtils.isEmpty(course.getVideo())) {
            System.out.println(course.getName() + "不含有视频，不批准");
            return;
        }

        System.out.println(course.getName() + "含有视频，批准");
        if (approver != null) {
            approver.deploy(course);
        }
    }
}
