package org.example;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.example.driver.DriverManager;

public class Hooks {//This class for setup and teardown methods, where we call all before and after methods
    DriverManager driverManager = new DriverManager();//we are not extending Drivermanager class here in Hooks instead creating object of Drivermanager class

    //So object will initialise Drivermanager constructor and it will intialise driver so thru the object we can use all the methods
    @Before
    public void setup() throws IllegalAccessException {
        driverManager.openLocalBrowser();
        driverManager.maximiseBrowser();
        driverManager.openURL();
        driverManager.applyImplicitWait();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            driverManager.takeScreenshot(scenario);}
        driverManager.closeBrowser();
    }
}