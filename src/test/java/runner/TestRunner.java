package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/br/com/features", tags = "@multiplicacao", glue = "br.com.steps"

)

public class TestRunner {

}


