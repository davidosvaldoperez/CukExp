Feature: 
  Cucumbers are delicious.

  Scenario: I eat some cucumbers
    Given I have 4 cucumbers
    When I eat 2 cucumbers
    Then I should still have 2 more cucumbers to eat

  Scenario: I eat my only cucumber
    Given I have 1 cucumber
    When I eat 1 cucumber
    Then I should not have any more cucumbers to eat