import cucumber.api.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = "src/test/java/features",
        glue = {"src/test/java/cucumber"},
        tags = {"~@Ignore"}
        //tags = {"@Before"}
      //   dryRun = false,
     //  strict = false

)
public class RunnerTest extends AbstractTestNGCucumberTests{
}




