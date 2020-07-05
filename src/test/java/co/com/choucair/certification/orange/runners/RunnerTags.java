package co.com.choucair.certification.orange.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/orange.feature",
        tags = "@tag1",
        glue = " co.com.choucair.certificacion.orange.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}
