
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 *
 * @author David <david.perez@hospitalitaliano.org.ar>
 */
public class BananaStepdef {
        
    long bananas;
    
    @Given("^I have (\\S+) bananas.*$")
    public void i_have_bananas(String have) {
        bananas = Long.valueOf(have);
    }

    @When("^I eat (\\S+) bananas.*$")
    public void i_eat_bananas(String eaten) {
        bananas -= Long.valueOf(eaten);
    }

    @Then("^I should still have (\\S+) more bananas to eat.*$")
    public void i_should_still_have_more_bananan_to_eat(String left) {
        assertThat(Long.valueOf(left), is(bananas));
    }
}
