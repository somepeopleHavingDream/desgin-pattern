package org.yangxin.desginpattern.pattern.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yangxin
 * 2020/04/07 21:36
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Article {

    private String title;
    private String content;
    private String img;

    public ArticleMemento saveToMemento() {
        return new ArticleMemento(title, content, img);
    }

    public void undoFromMemento(ArticleMemento articleMemento) {
        this.title = articleMemento.getTitle();
        this.content = articleMemento.getContent();
        this.img = articleMemento.getImg();
    }
}
