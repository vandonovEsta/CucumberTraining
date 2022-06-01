package stepdefinitions;

import helpers.StringHelper;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CompareStringsSteps {

    StringHelper stringHelper;
    private String inputWord;
    private String firstSentence;
    private String secondSentence;

    @ParameterType(".*")
    public Boolean bool(String boolString) {
        return Boolean.getBoolean(boolString);
    }

    @Before
    public void init() {
        stringHelper = new StringHelper();
    }


    @Given("Input is {word}")
    public void input_is(String word) {
        inputWord = word;
    }

    @When("All {word} characters are removed")
    public void we_remove_all_the_characters(String character) throws Exception {

        inputWord = stringHelper.removeAllCharacters(inputWord, character);
    }


    @Then("Should match {word}")
    public void we_should_have(String word) {
        Assert.assertTrue(inputWord + " does not equal " + word,
                stringHelper.compare(inputWord, word));

        System.out.println("\nSuccess the final word is " + inputWord);
    }

    @When("Case sensitive is {bool}")
    public void case_sensitive_is(Boolean bool) {
        stringHelper.setCaseSensitive(bool);
    }

    @Given("_First/_1st sentence is set to: {string}")
    public void first_sentence_is_set_to(String sentence) {
        firstSentence = sentence;
    }

    @Given("_Second/_2nd sentence is set to: {string}")
    public void _second_sentence_is_set_to(String sentence) {
        secondSentence = sentence;
    }

    @When("First {string} is removed")
    public void first_is_removed(String string) throws Exception {
        firstSentence = stringHelper.removeFirst(firstSentence, string);
    }

    @When("All {string} are removed")
    public void all_are_removed(String string) throws Exception {
        char[] chars = string.toCharArray();
        for (char character :
                chars) {
            firstSentence = stringHelper.removeAllCharacters(firstSentence, String.valueOf(character));
        }
    }

    @Then("_First sentence should equal _Second sentence")
    public void _first_sentence_should_equal__second_sentence() {
        Assert.assertEquals(firstSentence, secondSentence);
        System.out.println("\nSuccess! \n" + firstSentence + "\n matches \n" + secondSentence);
    }
}
