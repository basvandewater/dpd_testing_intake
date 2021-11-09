package com.wartsila.testing.cucumber.hooks;

import com.wartsila.testing.cucumber.steps.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks {

    private BasePage basePage = new BasePage();

    // Always run this method last (order is descending)
    @After(order = 0)
    public void scenarioTearDown(Scenario scenario) {
        basePage.close();
    }
}
