package org.yangxin.desginpattern.pattern.behavioral.memento;

import java.util.Stack;

/**
 * @author yangxin
 * 2020/04/07 21:40
 */
public class ArticleMementoManager {

    private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<>();

    public ArticleMemento getMemento() {
        return ARTICLE_MEMENTO_STACK.pop();
    }

    public void addMemento(ArticleMemento articleMemento) {
        ARTICLE_MEMENTO_STACK.push(articleMemento);
    }
}
