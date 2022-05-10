package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.HelloWorldApp;
import org.junit.Assert;

import static org.example.HelloWorldApp.*;

public class HelloWorldSteps {

    private String greeting;
    private String name;
    @Given("No specific name is given")
    public void no_specific_name_is_given() {
        // Write code here that turns the phrase above into concrete actions
        name = "";
    }
    @When("The Hello World app is called")
    public void the_hello_world_app_is_called() {
        // Write code here that turns the phrase above into concrete actions
        if(name == null || name.isEmpty()){
            greeting = greet();
        } else {
            greeting = greet(name);
        }
    }
    @Then("The Hello world greeting should be returned.")
    public void the_hello_world_greeting_should_be_returned() {
        Assert.assertEquals(greeting, "Hello World!");

    }
}
