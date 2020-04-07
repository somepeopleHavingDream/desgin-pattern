package org.yangxin.desginpattern.pattern.behavioral.memento;

/**
 * @author yangxin
 * 2020/04/07 21:47
 */
public class Test {

    public static void main(String[] args) {
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();

        Article article = new Article("如影随行的设计模式A", "手记内容A", "手记图片A");
        ArticleMemento articleMemento = article.saveToMemento();

        articleMementoManager.addMemento(articleMemento);
        System.out.println(article);

        article.setTitle("如影随行的设计模式B");
        article.setContent("手记内容B");
        article.setImg("手记图片B");
        System.out.println(article);

        articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);

        System.out.println(articleMementoManager.getMemento());
        System.out.println(articleMementoManager.getMemento());
    }
}
