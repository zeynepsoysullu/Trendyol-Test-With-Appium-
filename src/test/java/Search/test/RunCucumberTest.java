package Search.test;

import Search.base.BaseTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\HP\\IdeaProjects\\TrendyolTest\\src\\test\\resources\\product_details.feature",
        glue = "Search.Steps"
)
public class RunCucumberTest extends BaseTest {
}
