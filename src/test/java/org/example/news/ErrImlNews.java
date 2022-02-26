package org.example.news;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class ErrImlNews {

    public ElementsCollection news =$$("div.category-item");

    public void printNews(int number){
        System.out.println(news.get(number).$$(".category-news-header").get(0).getText());
        System.out.println(news.get(number).$$(".category-news-lead").get(0).getText());
    }
}
