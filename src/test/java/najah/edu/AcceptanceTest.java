package najah.edu;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(features="features",monochrome = true, snippets = SnippetType.CAMELCASE, glue = {"najah.edu"} )

public class AcceptanceTest {
    
}
