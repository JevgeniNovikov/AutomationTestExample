package org.example.news;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ErrTest {

    @Test
    public void TestE1() {
        open("https://www.err.ee/");
        ErrIlm ilm = new ErrIlm();
        ErrImlNews errNews = new ErrImlNews();
        ilm.getIlmPage();
        $("h1.block-header").shouldHave(text("Nelja päeva prognoos"));
        ilm.printTomorrowIlm();
        errNews.news.shouldHave(sizeGreaterThan(20));//bloki s novostjami
        errNews.printNews(0);
        System.out.println();
        errNews.printNews(1);

    }
}
