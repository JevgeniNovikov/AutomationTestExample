package org.example.google;

import com.codeborne.selenide.ElementsCollection;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {


    @Test
    public void customizeCookies() {
        open("https://google.com");
        $("button#VnjCcb").click();

        ElementsCollection sections = $$("div.AaN0Dd");
        sections.get(0).$$("button").get(0).click();
        sections.get(1).$$("button").get(0).click();
        sections.get(2).$$("button").get(2).click();

        $("button.AjY5Oe").click();
        $("input.gLFyf").shouldBe(visible);

        $("input.gLFyf").click();
        $("input.gLFyf").setValue("selenide");
        $("input.gLFyf").pressEnter();
        if ($("h3").shouldHave(text("Selenide: concise UI tests in Java")).isDisplayed()) {
            $("h3").shouldHave(text("Selenide: concise UI tests in Java")).click();
        }
        $("[href='/quick-start.html']").shouldHave(text("Quick start")).click();
        $("h3#do-you-want-to-see-a-working-example").shouldBe(visible);
        $("[href='https://github.com/selenide-examples/google/blob/master/test/org/selenide/examples/google/selenide_page_object/GoogleTest.java']").click();
        if($("a[data-view-component='true'][href='/selenide-examples/google/find/master']").isDisplayed()){
            $("a[data-view-component='true'][href='/selenide-examples/google/find/master']").click();
        }
        $("input.header-search-input").shouldBe(visible);
        $("input.header-search-input").click();
        $("input.header-search-input").setValue("ok");




    }
}
