package stepdefinitions;

import helpers.StringHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class WordCountSteps {
    String article;
    StringHelper stringHelper = new StringHelper();

    @Given("User has following text")
    public void userHasTheFollowingText(String articleParagraph) {
        article = articleParagraph;

    }

    @Then("User counts the words/word")
    public void userCountsTheWords() {
        System.out.println("\nTotal words in the article are " + stringHelper.countWords(article));
    }
}
