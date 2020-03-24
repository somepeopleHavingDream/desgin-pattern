package org.yangxin.desginpattern.pattern.behavioral.templatemethod;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author yangxin
 * 2020/03/24 20:51
 */
@NoArgsConstructor
@AllArgsConstructor
public class FECourse extends AbstractCourse {

    private boolean needWriteArticleFlag = false;

    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体素材");
    }

    @Override
    protected boolean needWriteArticle() {
        return needWriteArticleFlag;
    }
}
