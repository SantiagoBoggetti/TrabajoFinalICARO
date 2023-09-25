package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.icaro.tests.stepDefinitions", "com.icaro.tests.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class cucumberrunner extends AbstractTestNGCucumberTests {
}
