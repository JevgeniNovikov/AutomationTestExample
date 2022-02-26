package org.example.shop1a;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class ShopPage {
    public SelenideElement search=$("input#q");


    public void searching (String text){
        search.val(text).pressEnter();
    }
}
