package org.example.shop1a;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;

public class AddItem {

    public ElementsCollection itemSection =$$("div.ks-product-grid-row");

    public void addToCartFirstItem (){
        itemSection.get(0).$$("div.sn-product-inner--hover").get(0).hover();//nomer produkta ih 16
        itemSection.get(0).$$("button.ks-add-to-cart-catalog-btn").get(1).click();//add to cart button
    }



}
