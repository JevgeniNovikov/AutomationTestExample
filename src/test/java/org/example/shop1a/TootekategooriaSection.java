package org.example.shop1a;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class TootekategooriaSection {
    public SelenideElement headingName =$("div.sn-categories");
    public ElementsCollection kategooriaElement =$$("a.ks-filter-link.sn-filter-link");

    public void tootekategooriaHeading (String text){
        headingName.shouldHave(text(text));
    }

    public void tootekategooriaNumberOfElements (int count){
        kategooriaElement.shouldHave(size(count));
    }

    public void tootekategooriaElementsCheck(String text1, String text2, String text3){
        kategooriaElement.get(0).shouldHave(text(text1));
        kategooriaElement.get(1).shouldHave(text(text2));
        kategooriaElement.get(2).shouldHave(text(text3));
    }

    public void tootekategooriaElementChoice (int elementNumber) {
        if (elementNumber == 1) {
            kategooriaElement.get(0).click();
        }
        if (elementNumber == 2) {
            kategooriaElement.get(1).click();
        }
        if (elementNumber == 3) {
            kategooriaElement.get(2).click();
        }
    }


}
