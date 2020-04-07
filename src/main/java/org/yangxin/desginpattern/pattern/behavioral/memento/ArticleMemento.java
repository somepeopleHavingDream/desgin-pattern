package org.yangxin.desginpattern.pattern.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author yangxin
 * 2020/04/07 21:38
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ArticleMemento {

    private String title;
    private String content;
    private String img;
}
