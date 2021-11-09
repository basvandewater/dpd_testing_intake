package com.wartsila.testing.cucumber.pages;

import com.wartsila.testing.cucumber.steps.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

    @FindBy (css = "[class='select2-search__field']")
    WebElement searchBarInput;

    @FindBy (css = "#select2-hotels_city-container")
    WebElement searchBar;

    public void open() {
        open("https://www.phptravels.net/");
    }

    public void searchFor(String query) {
        waitFor(searchBar);
        click(searchBar);
        type(searchBarInput, query);
    }
}
