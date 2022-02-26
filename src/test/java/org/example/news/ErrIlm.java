package org.example.news;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class ErrIlm {

    public ElementsCollection header =$$("div.desktop-only-header");//stroka s zagolovkom
    public ElementsCollection weather = $$("div.weather-container");//blok s pogodoj;

    public void getIlmPage (){
        header.get(0).$$(".dropdown").get(0).hover();//otkrqvajem UUDISED
        header.get(0).$$(".dropdown").get(0).$$(".channelmenu").get(13).click();//vqbrali pogodu
    }

    public void printTomorrowIlm (){
        weather.get(0).$$(".weather-day").get(0).$$("div.weather-date").get(0).shouldHave(text("Homme"));
        System.out.print(weather.get(0).$$(".weather-day").get(0).$$("div.weather-date").get(0).getText()+" ");
        System.out.println(weather.get(0).$$(".weather-day").get(0).$$("div.weather-night-container").get(0).getText());
        System.out.print(weather.get(0).$$(".weather-day").get(0).$$("div.weather-date").get(0).getText()+" ");
        System.out.println(weather.get(0).$$(".weather-day").get(0).$$("div.weather-day-container").get(0).getText());
    }
}
