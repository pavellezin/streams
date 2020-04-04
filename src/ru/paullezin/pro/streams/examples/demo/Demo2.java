package ru.paullezin.pro.streams.examples.demo;

import ru.paullezin.pro.streams.examples.model.Article;

import java.util.Set;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {

        Set<Article> articles = Article.readAll();

        String article19160 = articles.stream()
                .filter(article -> article.getInceptionYear() == 1960)
                .map(Article::getTitle)
                .collect(Collectors.joining(", "));
        System.out.println("article19160 = " + article19160);
    }
}
