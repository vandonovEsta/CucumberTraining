Feature: Word counter

  Scenario: Count the words
    Given User has following text
    """
    We talk with organizers who were at the Wisconsin Capitol during the 2011 uprisings
    about how organized labor lost the battle over Act 10 and “right to work”, how the ruling class won,
    and what comes next.
    """
    Then User counts the words

    Scenario: Only one word
      Given User has following text
      """
      Car
      """
      Then User counts the word