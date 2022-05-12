Feature: Words should be successfully compared

  Rule Compare words

  Scenario: Remove unwanted characters from a word and compare it to the expected
    Given Input is Examplesssz
    When All s characters are removed
    And All z characters are removed
    Then Should match Example

  Scenario: Make a case insensitive compare between two wrods
    Given Input is example
    When Case sensitive is false
    Then Should match Example

  Rule: Compare Sentences


    Scenario: Reformat and compare sentences
      Given _First sentence is set to: "My sentence (and more…)!!?"
      And _Second sentence is set to: "My sentence and more…!!"
      When First "?" is removed
      And All "()" are removed
      And Case sensitive is true
      Then _First sentence should equal _Second sentence