package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/",glue ="step_definitions",dryRun=false,
        plugin = {"json:target/cucumber.json"})
public class CukesRunner {

}
