package org.example.shop1a;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestOneAShop {

    @Test
    public void Test1() {
        ShopPage shopPage = new ShopPage();
        TootekategooriaSection tootekategooriaSection = new TootekategooriaSection();
        open("https://www.1a.ee/");
        shopPage.searching("brit care 12");
        $("h1").shouldHave(text("Otsingutulemused"));

        tootekategooriaSection.tootekategooriaHeading("Tootekategooria");
        tootekategooriaSection.tootekategooriaNumberOfElements(3);
        tootekategooriaSection.tootekategooriaElementsCountCheck("8","5","3");
        tootekategooriaSection.tootekategooriaElementChoice(2);
        SortBy sortBy = new SortBy();

        sortBy.openSortItemBy();
        sortBy.sortItemBy("Hinna järgi kasvavalt");

        AddItem addItem = new AddItem();
        addItem.addToCartFirstItem();

        if($("div.title-success").shouldHave(text("Toode on edukalt lisatud ostukorvi")).isDisplayed()){
            $("a.main-button-border").click();
        }

    }
}
