package capacitacionmobile.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(
    features = {"src/test/resources/features/soucelabs.feature"},
    tags = "@login",
    glue = {"capacitacionmobile.stepdefinitions"},
    snippets = CucumberOptions.SnippetType.CAMELCASE
)
 @RunWith(CucumberWithSerenity.class)
public class RunnerTags {
}
