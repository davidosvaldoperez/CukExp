
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 *
 * @author David <david.perez@hospitalitaliano.org.ar>
 */
public class StepDefs {
    
    int cucumbers;
    
    @Given("I have {int} cucumber(s)")
    public void i_have_cucumbers(int have) throws Exception {
        cucumbers = have;
    }

    @When("I eat {int} cucumber(s)")
    public void i_eat_cucumbers(int eaten) throws Exception {
        cucumbers-=eaten;
    }

    @Then("I should still have {int} more cucumbers to eat")
    public void i_should_still_have_more_cucumbers_to_eat(int left) throws Exception {
        assertThat(cucumbers, is(left));
    }

    @Then("I should not have any more cucumbers to eat")
    public void i_should_not_have_any_more_cucumbers_to_eat() throws Exception {
        assertThat(cucumbers, is(0));
    }
}
