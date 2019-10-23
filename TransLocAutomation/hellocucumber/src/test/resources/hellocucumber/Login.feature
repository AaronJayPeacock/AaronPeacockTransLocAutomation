Feature: Does the login feature work

  Scenario: I can successfully login to Architect
    Given I am on the Architect Stage TransLoc login page
    When I enter qa_user_02 into the username text box
    And I enter XMp$g7qc6Q6p5r!Rm5 into the password text box
    And I click on the Log in button
    Then I will successfully log in to the Architect Feeds page

  Scenario: I am rejected entry into Architect with the wrong credentials
    Given I am on the Architect Stage TransLoc login page
    When I enter qa_user_02 into the username text box
    And I enter invalid_Password into the password text box
    And I click on the Log in button
    Then I should be presented with an Invalid password login page