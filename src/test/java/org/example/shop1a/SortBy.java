package org.example.shop1a;

import com.codeborne.selenide.ElementsCollection;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.$$;

public class SortBy {

    public ElementsCollection sortingSection =$$("div.sn-filter-toolbox-row");
    public ElementsCollection sort = $$("select.select2-hidden-accessible");

    public void openSortItemBy(){
        sortingSection.get(0).$$("div.ks-sort-select-wrap").get(0).click();
    }

    public void sortItemBy (String sortBy){
        if(Objects.equals(sortBy, "Populaarsemad")) {
            sort.get(1).$$("option").get(0).click();
        }
        if(Objects.equals(sortBy, "Hinna järgi kahanevalt")) {
            sort.get(1).$$("option").get(1).click();
        }
        if(Objects.equals(sortBy, "Hinna järgi kasvavalt")) {
            sort.get(1).$$("option").get(2).click();
        }
    }

}
