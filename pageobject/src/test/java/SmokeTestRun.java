import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(monochrome = true,
        features = {
               "src/test/resources/features/smoke/Smoke_send_CV.feature",
               "src/test/resources/features/smoke/Smoke_ask_reference.feature",
               "src/test/resources/features/smoke/Smoke_see_more_references.feature",
               "src/test/resources/features/smoke/Smoke_see_more_events.feature",
        },
        glue = "stepdefinitions")

//@CucumberOptions(features = "src/test/resources/features/smoke/Smoke_see_more_references.feature")
public class SmokeTestRun {

}
