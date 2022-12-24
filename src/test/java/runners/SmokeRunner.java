package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features we use to provide the path of all the feature files
        features = "src/test/resources/features/",
        glue = "steps",
        dryRun=false,
        tags="@niceAndEasy1",
        monochrome = true,

        plugin={"pretty","html:target/cucumber.html","json:target/cucumber.json",
                "rerun:target/failed.txt"}
)
public class SmokeRunner {
}