

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 *
 * @author David <david.perez@hospitalitaliano.org.ar>
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:html_docs"})
public class TestRunner {
    
}
