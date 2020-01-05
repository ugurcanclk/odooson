package com.odoo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json","html:target/default-cucumber-reports"},
        features = "src/test/resources/features",  //buradaki siralama onemli degil  // features = "src/test/resources/features/Login.feature",
        glue = "com/vytrack/step_definitions",
        dryRun = true,
        tags = "@par"

)
public class CukesRunner {
}
