package com.wartsila.testing.cucumber.steps;

import com.wartsila.testing.cucumber.pages.LandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LandingPageSteps {

    private LandingPage landingPage;

    public LandingPageSteps() {
        landingPage = new LandingPage();
    }

    @Given("PHP Travel website is opened")
    public void phpTravelWebsiteIsOpened() {
        landingPage.open();
    }

    @When("the user searches for an hotel in {string}")
    public void theUserSearchesForAnHotelInAmsterdam(String city) {
        landingPage.searchFor(city);
    }
}
