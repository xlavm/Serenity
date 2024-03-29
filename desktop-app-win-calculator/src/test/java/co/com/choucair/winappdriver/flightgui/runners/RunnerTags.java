package co.com.choucair.winappdriver.flightgui.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Calculator.feature",
        glue = {"co.com.choucair.winappdriver.flightgui.stepdefinitions","co.com.choucair.winappdriver.flightgui.utils"},
        snippets = SnippetType.CAMELCASE
)
public class RunnerTags {
}
