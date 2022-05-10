Feature: Hello World greeting feature
  In order to validate the correct greeting
  The HelloWordApp needs to be called

  Scenario: Hello World Greeting
    Given No specific name is given
    When The Hello World app is called
    Then The Hello World app greeting should be returned.

  Scenario: Hello Greg Greeting
    Given Greg enters the room
    When The Hello World app is called
    Then The Hello World app greeting should be returned.